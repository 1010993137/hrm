package com.hrm.web.controller.system;

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
import com.hrm.common.annotation.Log;
import com.hrm.common.enums.BusinessType;
import com.hrm.system.domain.SysRecruit;
import com.hrm.system.service.ISysRecruitService;
import com.hrm.common.core.controller.BaseController;
import com.hrm.common.core.domain.AjaxResult;
import com.hrm.common.utils.poi.ExcelUtil;
import com.hrm.common.core.page.TableDataInfo;

/**
 * 应聘人员信息Controller
 * 
 * @author gaoyang
 * @date 2020-03-20
 */
@Controller
@RequestMapping("/system/recruit")
public class SysRecruitController extends BaseController
{
    private String prefix = "system/recruit";

    @Autowired
    private ISysRecruitService sysRecruitService;

    @RequiresPermissions("system:recruit:view")
    @GetMapping()
    public String recruit()
    {
        return prefix + "/recruit";
    }

    /**
     * 查询应聘人员信息列表
     */
    @RequiresPermissions("system:recruit:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysRecruit sysRecruit)
    {
        startPage();
        List<SysRecruit> list = sysRecruitService.selectSysRecruitList(sysRecruit);
        return getDataTable(list);
    }

    /**
     * 导出应聘人员信息列表
     */
    @RequiresPermissions("system:recruit:export")
    @Log(title = "应聘人员信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysRecruit sysRecruit)
    {
        List<SysRecruit> list = sysRecruitService.selectSysRecruitList(sysRecruit);
        ExcelUtil<SysRecruit> util = new ExcelUtil<SysRecruit>(SysRecruit.class);
        return util.exportExcel(list, "recruit");
    }

    /**
     * 新增应聘人员信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存应聘人员信息
     */
    @RequiresPermissions("system:recruit:add")
    @Log(title = "应聘人员信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysRecruit sysRecruit)
    {
        return toAjax(sysRecruitService.insertSysRecruit(sysRecruit));
    }

    /**
     * 修改应聘人员信息
     */
    @GetMapping("/edit/{recruitId}")
    public String edit(@PathVariable("recruitId") Long recruitId, ModelMap mmap)
    {
        SysRecruit sysRecruit = sysRecruitService.selectSysRecruitById(recruitId);
        mmap.put("sysRecruit", sysRecruit);
        return prefix + "/edit";
    }

    /**
     * 修改保存应聘人员信息
     */
    @RequiresPermissions("system:recruit:edit")
    @Log(title = "应聘人员信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysRecruit sysRecruit)
    {
        return toAjax(sysRecruitService.updateSysRecruit(sysRecruit));
    }

    /**
     * 删除应聘人员信息
     */
    @RequiresPermissions("system:recruit:remove")
    @Log(title = "应聘人员信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysRecruitService.deleteSysRecruitByIds(ids));
    }
}
