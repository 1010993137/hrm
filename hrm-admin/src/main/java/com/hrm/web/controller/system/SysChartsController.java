package com.hrm.web.controller.system;

import com.hrm.common.core.controller.BaseController;
import com.hrm.framework.util.ShiroUtils;
import com.hrm.system.domain.*;
import com.hrm.system.service.ISysChartsService;
import com.hrm.system.service.ISysDeptService;
import com.hrm.system.service.ISysEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 图表控制层
 **/
@Controller
@RequestMapping("/charts")
public class SysChartsController extends BaseController {
    @Autowired
    private ISysEmployeeService sysEmployeeService;
    @Autowired
    private ISysDeptService sysDeptService;
    @Autowired
    private ISysChartsService sysChartsService;



    /**
     * 跳转数据分析
     */
    @GetMapping()
    public String index()
    {
        return "system/charts/index";
    }

    /**
     * 获取员工年龄分布情况
     * @return 员工年龄分布情况
     */
    @ResponseBody
    @RequestMapping("/getEmployeeAgeDistribution")
    public List<SysEmployeeAgeDistribution> getEmployeeAgeDistribution(){
        //获取登录人的负责部门有哪些，用来查询负责的员工
        SysEmployee sysEmployee = new SysEmployee();
        List<SysDept> deptList = sysDeptService.selectDeptByUserId(ShiroUtils.getUserId());
        sysEmployee.setDeptList(deptList);
        return sysEmployeeService.getEmployeeAgeDistribution(sysEmployee);
    }

    /**
     * 获取员工学历分布情况
     * @return 员工学历分布情况
     */
    @ResponseBody
    @RequestMapping("/getEmployeeDegreeDistribution")
    public List<SysEmployeeDegreeDistribution> getEmployeeDegreeDistribution(){
        //获取登录人的负责部门有哪些，用来查询负责的员工
        SysEmployee sysEmployee = new SysEmployee();
        List<SysDept> deptList = sysDeptService.selectDeptByUserId(ShiroUtils.getUserId());
        sysEmployee.setDeptList(deptList);
        return sysEmployeeService.getEmployeeDegreeDistribution(sysEmployee);
    }

    /**
     * 获取离职数量和职位需求数量
     * @return
     */
    @ResponseBody
    @RequestMapping("/getResignationNumAndPostNum")
    public Map<String,List<SysCharts>> getResignationNumAndPostNum(){
        List<SysDept> deptList = sysDeptService.selectDeptByUserId(ShiroUtils.getUserId());
        SysCharts sysCharts = new SysCharts();
        sysCharts.setDeptList(deptList);
        return sysChartsService.getResignationNumAndPostNum(sysCharts);
    }

}
