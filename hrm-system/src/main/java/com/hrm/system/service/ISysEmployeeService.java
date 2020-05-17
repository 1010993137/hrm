package com.hrm.system.service;

import java.util.List;

import com.hrm.system.domain.SysEmployee;
import com.hrm.system.domain.SysEmployeeAgeDistribution;
import com.hrm.system.domain.SysEmployeeDegreeDistribution;

/**
 * 员工信息Service接口
 * 
 * @author gaoyang
 * @date 2020-03-14
 */
public interface ISysEmployeeService 
{
	
	/**
     * 查询所有员工名
     * 
     * @return 员工列表
     */
    public List<SysEmployee> selectEmployeeAll();
    
    /**
     * 查询员工信息
     * 
     * @param employeeId 员工信息ID
     * @return 员工信息
     */
    public SysEmployee selectSysEmployeeById(Long employeeId);

    /**
     * 查询员工信息列表
     * 
     * @param sysEmployee 员工信息
     * @return 员工信息集合
     */
    public List<SysEmployee> selectSysEmployeeList(SysEmployee sysEmployee);

    /**
     * 新增员工信息
     * 
     * @param sysEmployee 员工信息
     * @return 结果
     */
    public int insertSysEmployee(SysEmployee sysEmployee);

    /**
     * 修改员工信息
     * 
     * @param sysEmployee 员工信息
     * @return 结果
     */
    public int updateSysEmployee(SysEmployee sysEmployee);

    /**
     * 批量删除员工信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysEmployeeByIds(String ids);

    /**
     * 删除员工信息信息
     * 
     * @param employeeId 员工信息ID
     * @return 结果
     */
    public int deleteSysEmployeeById(Long employeeId);
    
    /**
     * 根据姓名查询部门
     * 
     * @param employeeName 员工姓名
     * @return 部门信息
     */
    public SysEmployee selectDeptByName(String employeeName);

    /**
     * 查询员工总数
     */
    public String getEmployeeNum();

    /**
     * 查询正式员工数量
     * @return 员工数量
     */
    public String getFormalEmployeeNum();

    /**
     * 查询本月入职员工数量
     * @return 员工数量
     */
    public String getTisMonthEntryEmployeeNum();

    /**
     * 获取员工年龄分布情况
     * @return
     */
    public List<SysEmployeeAgeDistribution> getEmployeeAgeDistribution();

    /**
     * 获取员工年学历布情况
     * @return
     */
    public List<SysEmployeeDegreeDistribution> getEmployeeDegreeDistribution();
}
