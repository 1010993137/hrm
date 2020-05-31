package com.hrm.web.controller.system;

import java.util.List;

import com.hrm.system.domain.SysDept;
import com.hrm.system.domain.SysEmployee;
import com.hrm.system.service.ISysDeptService;
import com.hrm.system.service.ISysEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import com.hrm.common.config.Global;
import com.hrm.common.core.controller.BaseController;
import com.hrm.framework.util.ShiroUtils;
import com.hrm.system.domain.SysMenu;
import com.hrm.system.domain.SysUser;
import com.hrm.system.service.ISysMenuService;

/**
 * 首页 业务处理
 * 
 * @author gaoyang
 */
@Controller
public class SysIndexController extends BaseController
{
    @Autowired
    private ISysMenuService menuService;
    @Autowired
    private ISysEmployeeService sysEmployeeService;
    @Autowired
    private ISysDeptService sysDeptService;

    // 系统首页
    @GetMapping("/index")
    public String index(ModelMap mmap)
    {
        // 取身份信息
        SysUser user = ShiroUtils.getSysUser();
        // 根据用户id取出菜单
        List<SysMenu> menus = menuService.selectMenusByUser(user);
        mmap.put("menus", menus);
        mmap.put("user", user);
        mmap.put("copyrightYear", Global.getCopyrightYear());
        mmap.put("demoEnabled", Global.isDemoEnabled());
        return "index";
    }

    // 切换主题
    @GetMapping("/system/switchSkin")
    public String switchSkin(ModelMap mmap)
    {
        return "skin";
    }

    // 公司概况
    @GetMapping("/system/main")
    public String main(ModelMap mmap)
    {
        //获取登录人的负责部门有哪些，用来查询负责的员工
        SysEmployee sysEmployee = new SysEmployee();
        List<SysDept> deptList = sysDeptService.selectDeptByUserId(ShiroUtils.getUserId());
        sysEmployee.setDeptList(deptList);
        //获取员工总数
        String employeeNum = sysEmployeeService.getEmployeeNum(sysEmployee);
        //获取正式员工数量
        String formalEmployeeNum = sysEmployeeService.getFormalEmployeeNum(sysEmployee);
        //获取本月入职人数
        String thisMonthEntryEmployeeNum = sysEmployeeService.getTisMonthEntryEmployeeNum(sysEmployee);
        mmap.put("version", Global.getVersion());
        mmap.put("employeeNum",employeeNum);
        mmap.put("formalEmployeeNum",formalEmployeeNum);
        mmap.put("thisMonthEntryEmployeeNum",thisMonthEntryEmployeeNum);
        return "main";
    }
}
