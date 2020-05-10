package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysEmployee;

/**
 * 员工信息Mapper接口
 * 
 * @author gaoyang
 * @date 2020-03-13
 */
public interface SysEmployeeMapper 
{
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
}
