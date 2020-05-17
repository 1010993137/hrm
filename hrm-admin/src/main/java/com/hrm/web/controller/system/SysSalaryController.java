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
import com.hrm.system.domain.SysSalary;
import com.hrm.system.service.ISysEmployeeService;
import com.hrm.system.service.ISysSalaryService;
import com.hrm.common.core.controller.BaseController;
import com.hrm.common.core.domain.AjaxResult;
import com.hrm.common.utils.poi.ExcelUtil;
import com.hrm.common.core.page.TableDataInfo;

/**
 * 薪资管理Controller
 * 
 * @author gaoyang
 * @date 2020-03-22
 */
@Controller
@RequestMapping("/system/salary")
public class SysSalaryController extends BaseController
{
    private String prefix = "system/salary";

    @Autowired
    private ISysSalaryService sysSalaryService;
    @Autowired
    private ISysEmployeeService sysEmployeeService;
    
    @RequiresPermissions("system:salary:view")
    @GetMapping()
    public String salary()
    {
        return prefix + "/salary";
    }

    /**
     * 查询薪资管理列表
     */
    @RequiresPermissions("system:salary:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysSalary sysSalary)
    {
        startPage();
        List<SysSalary> list = sysSalaryService.selectSysSalaryList(sysSalary);
        return getDataTable(list);
    }

    /**
     * 导出薪资管理列表
     */
    @RequiresPermissions("system:salary:export")
    @Log(title = "薪资管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysSalary sysSalary)
    {
        List<SysSalary> list = sysSalaryService.selectSysSalaryList(sysSalary);
        ExcelUtil<SysSalary> util = new ExcelUtil<SysSalary>(SysSalary.class);
        return util.exportExcel(list, "salary");
    }

    /**
     * 新增薪资管理
     */
    @GetMapping("/add")
    public String add(ModelMap mmap)
    {
    	mmap.put("names", sysEmployeeService.selectEmployeeAll());
        return prefix + "/add";
    }

    /**
     * 新增保存薪资管理
     */
    @RequiresPermissions("system:salary:add")
    @Log(title = "薪资管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysSalary sysSalary)
    {
        return toAjax(sysSalaryService.insertSysSalary(sysSalary));
    }

    /**
     * 修改薪资管理
     */
    @GetMapping("/edit/{salaryId}")
    public String edit(@PathVariable("salaryId") Long salaryId, ModelMap mmap)
    {
        SysSalary sysSalary = sysSalaryService.selectSysSalaryById(salaryId);
        mmap.put("sysSalary", sysSalary);
        return prefix + "/edit";
    }

    /**
     * 修改保存薪资管理
     */
    @RequiresPermissions("system:salary:edit")
    @Log(title = "薪资管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysSalary sysSalary)
    {
        return toAjax(sysSalaryService.updateSysSalary(sysSalary));
    }

    /**
     * 删除薪资管理
     */
    @RequiresPermissions("system:salary:remove")
    @Log(title = "薪资管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysSalaryService.deleteSysSalaryByIds(ids));
    }
}
