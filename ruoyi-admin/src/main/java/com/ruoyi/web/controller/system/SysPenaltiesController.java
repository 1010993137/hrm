package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysPenalties;
import com.ruoyi.system.service.ISysEmployeeService;
import com.ruoyi.system.service.ISysPenaltiesService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 奖惩查询Controller
 * 
 * @author gaoyang
 * @date 2020-03-22
 */
@Controller
@RequestMapping("/system/penalties")
public class SysPenaltiesController extends BaseController
{
    private String prefix = "system/penalties";

    @Autowired
    private ISysPenaltiesService sysPenaltiesService;
    @Autowired
    private ISysEmployeeService sysEmployeeService;

    @RequiresPermissions("system:penalties:view")
    @GetMapping()
    public String penalties()
    {
        return prefix + "/penalties";
    }

    /**
     * 查询奖惩查询列表
     */
    @RequiresPermissions("system:penalties:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysPenalties sysPenalties)
    {
        startPage();
        List<SysPenalties> list = sysPenaltiesService.selectSysPenaltiesList(sysPenalties);
        return getDataTable(list);
    }

    /**
     * 导出奖惩查询列表
     */
    @RequiresPermissions("system:penalties:export")
    @Log(title = "奖惩查询", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysPenalties sysPenalties)
    {
        List<SysPenalties> list = sysPenaltiesService.selectSysPenaltiesList(sysPenalties);
        ExcelUtil<SysPenalties> util = new ExcelUtil<SysPenalties>(SysPenalties.class);
        return util.exportExcel(list, "penalties");
    }

    /**
     * 新增奖惩查询
     */
    @GetMapping("/add")
    public String add(ModelMap mmap)
    {
    	mmap.put("names", sysEmployeeService.selectEmployeeAll());
        return prefix + "/add";
    }

    /**
     * 新增保存奖惩查询
     */
    @RequiresPermissions("system:penalties:add")
    @Log(title = "奖惩查询", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysPenalties sysPenalties)
    {
        return toAjax(sysPenaltiesService.insertSysPenalties(sysPenalties));
    }

    /**
     * 修改奖惩查询
     */
    @GetMapping("/edit/{penaltiesId}")
    public String edit(@PathVariable("penaltiesId") Long penaltiesId, ModelMap mmap)
    {
        SysPenalties sysPenalties = sysPenaltiesService.selectSysPenaltiesById(penaltiesId);
        mmap.put("sysPenalties", sysPenalties);
        return prefix + "/edit";
    }

    /**
     * 修改保存奖惩查询
     */
    @RequiresPermissions("system:penalties:edit")
    @Log(title = "奖惩查询", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysPenalties sysPenalties)
    {
        return toAjax(sysPenaltiesService.updateSysPenalties(sysPenalties));
    }

    /**
     * 删除奖惩查询
     */
    @RequiresPermissions("system:penalties:remove")
    @Log(title = "奖惩查询", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysPenaltiesService.deleteSysPenaltiesByIds(ids));
    }
}
