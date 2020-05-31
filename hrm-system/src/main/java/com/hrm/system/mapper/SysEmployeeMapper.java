package com.hrm.system.mapper;

import java.util.List;
import com.hrm.system.domain.SysEmployee;
import com.hrm.system.domain.SysEmployeeAgeDistribution;
import com.hrm.system.domain.SysEmployeeDegreeDistribution;

/**
 * 员工信息Mapper接口
 * 
 * @author gaoyang
 * @date 2020-03-14
 */
public interface SysEmployeeMapper 
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
     * 删除员工信息
     * 
     * @param employeeId 员工信息ID
     * @return 结果
     */
    public int deleteSysEmployeeById(Long employeeId);

    /**
     * 批量删除员工信息
     * 
     * @param employeeIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysEmployeeByIds(String[] employeeIds);
    
    /**
     * 根据姓名查询部门
     * 
     * @param employeeName 员工姓名
     * @return 部门信息
     */
    public SysEmployee selectDeptByName(String employeeName);

    /**
     * 获取员工总数
     * @return 员工总数
     */
    public String getEmployeeNum(SysEmployee sysEmployee);

    /**
     * 获取正式员工数量
     * @return 正式员工数量
     */
    public String getFormalEmployeeNum(SysEmployee sysEmployee);

    /**
     * 获取本月入职员工数量
     * @return 本月入职员工数量
     */
    public String getTisMonthEntryEmployeeNum(SysEmployee sysEmployee);

    /**
     * 获取员工年龄分布情况
     * @return
     */
    public List<SysEmployeeAgeDistribution> getEmployeeAgeDistribution(SysEmployee sysEmployee);

    /**
     * 获取员工学历分布情况
     * @return 学历分布情况
     */
    public List<SysEmployeeDegreeDistribution> getEmployeeDegreeDistribution(SysEmployee sysEmployee);

}
