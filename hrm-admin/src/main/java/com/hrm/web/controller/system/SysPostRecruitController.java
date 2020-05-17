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
import com.hrm.system.domain.SysPostRecruit;
import com.hrm.system.service.ISysPostRecruitService;
import com.hrm.system.service.ISysPostService;
import com.hrm.common.core.controller.BaseController;
import com.hrm.common.core.domain.AjaxResult;
import com.hrm.common.utils.poi.ExcelUtil;
import com.hrm.common.core.page.TableDataInfo;

/**
 * 招聘岗位管理Controller
 * 
 * @author gaoyang
 * @date 2020-03-21
 */
@Controller
@RequestMapping("/system/postRecruit")
public class SysPostRecruitController extends BaseController
{
    private String prefix = "system/postRecruit";

    @Autowired
    private ISysPostRecruitService sysPostRecruitService;
    @Autowired
    private ISysPostService postService;

    @RequiresPermissions("system:postRecruit:view")
    @GetMapping()
    public String postRecruit()
    {
        return prefix + "/postRecruit";
    }

    /**
     * 查询招聘岗位管理列表
     */
    @RequiresPermissions("system:postRecruit:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysPostRecruit sysPostRecruit)
    {
        startPage();
        List<SysPostRecruit> list = sysPostRecruitService.selectSysPostRecruitList(sysPostRecruit);
        return getDataTable(list);
    }

    /**
     * 导出招聘岗位管理列表
     */
    @RequiresPermissions("system:postRecruit:export")
    @Log(title = "招聘岗位管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysPostRecruit sysPostRecruit)
    {
        List<SysPostRecruit> list = sysPostRecruitService.selectSysPostRecruitList(sysPostRecruit);
        ExcelUtil<SysPostRecruit> util = new ExcelUtil<SysPostRecruit>(SysPostRecruit.class);
        return util.exportExcel(list, "postRecruit");
    }

    /**
     * 新增招聘岗位管理
     */
    @GetMapping("/add")
    public String add(ModelMap mmap)
    {
    	mmap.put("posts", postService.selectPostAll());
        return prefix + "/add";
    }

    /**
     * 新增保存招聘岗位管理
     */
    @RequiresPermissions("system:postRecruit:add")
    @Log(title = "招聘岗位管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysPostRecruit sysPostRecruit)
    {
        return toAjax(sysPostRecruitService.insertSysPostRecruit(sysPostRecruit));
    }

    /**
     * 修改招聘岗位管理
     */
    @GetMapping("/edit/{postRecruitId}")
    public String edit(@PathVariable("postRecruitId") Long postRecruitId, ModelMap mmap)
    {
        SysPostRecruit sysPostRecruit = sysPostRecruitService.selectSysPostRecruitById(postRecruitId);
        mmap.put("sysPostRecruit", sysPostRecruit);
        return prefix + "/edit";
    }

    /**
     * 修改保存招聘岗位管理
     */
    @RequiresPermissions("system:postRecruit:edit")
    @Log(title = "招聘岗位管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysPostRecruit sysPostRecruit)
    {
        return toAjax(sysPostRecruitService.updateSysPostRecruit(sysPostRecruit));
    }

    /**
     * 删除招聘岗位管理
     */
    @RequiresPermissions("system:postRecruit:remove")
    @Log(title = "招聘岗位管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysPostRecruitService.deleteSysPostRecruitByIds(ids));
    }
}
