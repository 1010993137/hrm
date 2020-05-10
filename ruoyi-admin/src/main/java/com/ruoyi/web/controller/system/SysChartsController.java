package com.ruoyi.web.controller.system;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.system.domain.SysEmployeeAgeDistribution;
import com.ruoyi.system.domain.SysEmployeeDegreeDistribution;
import com.ruoyi.system.service.ISysEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 图表控制层
 **/
@Controller
@RequestMapping("/charts")
public class SysChartsController extends BaseController {
    @Autowired
    private ISysEmployeeService sysEmployeeService;

    /**
     * 获取员工人数
     * @return 员工人数
     */
    @ResponseBody
    @RequestMapping("/getEmployeeNum")
    public String getEmployeeNum(){
        return sysEmployeeService.getEmployeeNum();
    }

    /**
     *获取正式员工人数
     * @return
     */
    @ResponseBody
    @RequestMapping("/getFormalEmployeeNum")
    public String getFormalEmployeeNum(){
        return  sysEmployeeService.getFormalEmployeeNum();
    }

    /**
     * 获取本月入职的员工数量
     * @return 本月入职员工数量
     */
    @ResponseBody
    @RequestMapping("/getTisMonthEntryEmployeeNum")
    public String getTisMonthEntryEmployeeNum(){
        return sysEmployeeService.getTisMonthEntryEmployeeNum();
    }

    /**
     * 获取员工年龄分布情况
     * @return 员工年龄分布情况
     */
    @ResponseBody
    @RequestMapping("/getEmployeeAgeDistribution")
    public List<SysEmployeeAgeDistribution> getEmployeeAgeDistribution(){
        return sysEmployeeService.getEmployeeAgeDistribution();
    }

    /**
     * 获取员工学历分布情况
     * @return 员工学历分布情况
     */
    @ResponseBody
    @RequestMapping("/getEmployeeDegreeDistribution")
    public List<SysEmployeeDegreeDistribution> getEmployeeDegreeDistribution(){
        return sysEmployeeService.getEmployeeDegreeDistribution();
    }

}
