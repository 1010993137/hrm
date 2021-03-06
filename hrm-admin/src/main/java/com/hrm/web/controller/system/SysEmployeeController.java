package com.hrm.web.controller.system;

import java.util.List;

import com.hrm.common.core.domain.Ztree;
import com.hrm.framework.util.ShiroUtils;
import com.hrm.system.domain.SysDept;
import com.hrm.system.domain.SysRole;
import com.hrm.system.domain.SysUser;
import com.hrm.system.service.ISysDeptService;

import com.hrm.framework.util.ShiroUtils;
import com.hrm.system.domain.SysUser;
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
import com.hrm.system.domain.SysEmployee;
import com.hrm.system.service.ISysEmployeeService;
import com.hrm.system.service.ISysPostService;
import com.hrm.common.core.controller.BaseController;
import com.hrm.common.core.domain.AjaxResult;
import com.hrm.common.utils.poi.ExcelUtil;
import com.hrm.common.core.page.TableDataInfo;

/**
 * 员工信息Controller
 * 
 * @author gaoyang
 * @date 2020-03-14
 */
@Controller
@RequestMapping("/system/employee")
public class SysEmployeeController extends BaseController
{
    private String prefix = "system/employee";

    @Autowired
    private ISysEmployeeService sysEmployeeService;
    @Autowired
    private ISysPostService postService;
    @Autowired
    private ISysDeptService sysDeptService;

    @RequiresPermissions("system:employee:view")
    @GetMapping()
    public String employee()
    {
        return prefix + "/employee";
    }
    
    
    /**
     * 查询员工信息列表
     */
    @RequiresPermissions("system:employee:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysEmployee sysEmployee)
    {
        startPage();
        //获取登录人的负责部门有哪些，用来查询负责的员工
        List<SysDept> deptList = sysDeptService.selectDeptByUserId(ShiroUtils.getUserId());
        sysEmployee.setDeptList(deptList);
        List<SysEmployee> list = sysEmployeeService.selectSysEmployeeList(sysEmployee);
        return getDataTable(list);
    }
    
    /**
     * 根据名字获取员工信息
     * @param employeeId
     * @return 员工
     */
    @GetMapping("/getEmpById")
    @ResponseBody
    public SysEmployee getEmployeeById(int employeeId) {
    	SysEmployee list = sysEmployeeService.selectDeptById(employeeId);
		return list;
    }

    /**
     * 导出员工信息列表
     */
    @RequiresPermissions("system:employee:export")
    @Log(title = "员工信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysEmployee sysEmployee)
    {
        List<SysEmployee> list = sysEmployeeService.selectSysEmployeeList(sysEmployee);
        ExcelUtil<SysEmployee> util = new ExcelUtil<SysEmployee>(SysEmployee.class);
        return util.exportExcel(list, "employee");
    }

    /**
     * 新增员工信息
     */
    @GetMapping("/add")
    public String add(ModelMap mmap)
    {
    	mmap.put("posts", postService.selectPostAll());
        return prefix + "/add";
    }

    /**
     * 新增保存员工信息
     */
    @RequiresPermissions("system:employee:add")
    @Log(title = "员工信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysEmployee sysEmployee)
    {
        return toAjax(sysEmployeeService.insertSysEmployee(sysEmployee));
    }

    /**
     * 修改员工信息
     */
    @GetMapping("/edit/{employeeId}")
    public String edit(@PathVariable("employeeId") Long employeeId, ModelMap mmap)
    {
        SysEmployee sysEmployee = sysEmployeeService.selectSysEmployeeById(employeeId);
        mmap.put("sysEmployee", sysEmployee);
        mmap.put("posts", postService.selectPostsByEmployeeId(employeeId));
        return prefix + "/edit";
    }

    /**
     * 修改保存员工信息
     */
    @RequiresPermissions("system:employee:edit")
    @Log(title = "员工信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysEmployee sysEmployee)
    {
        return toAjax(sysEmployeeService.updateSysEmployee(sysEmployee));
    }

    /**
     * 删除员工信息
     */
    @RequiresPermissions("system:employee:remove")
    @Log(title = "员工信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysEmployeeService.deleteSysEmployeeByIds(ids));
    }
}
