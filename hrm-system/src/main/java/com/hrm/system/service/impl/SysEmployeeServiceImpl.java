package com.hrm.system.service.impl;

import java.util.List;

import com.hrm.system.domain.SysEmployeeAgeDistribution;
import com.hrm.system.domain.SysEmployeeDegreeDistribution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hrm.system.mapper.SysEmployeeMapper;
import com.hrm.system.domain.SysEmployee;
import com.hrm.system.service.ISysEmployeeService;
import com.hrm.common.core.text.Convert;

/**
 * 员工信息Service业务层处理
 *
 * @author gaoyang
 * @date 2020-03-14
 */
@Service
public class SysEmployeeServiceImpl implements ISysEmployeeService {

    @Autowired
    private SysEmployeeMapper sysEmployeeMapper;

    /**
     * 查询所有员工姓名
     *
     * @return 员工列表
     */
    @Override
    public List<SysEmployee> selectEmployeeAll() {
        // TODO Auto-generated method stub
        return sysEmployeeMapper.selectEmployeeAll();
    }

    /**
     * 查询员工信息
     *
     * @param employeeId 员工信息ID
     * @return 员工信息
     */
    @Override
    public SysEmployee selectSysEmployeeById(Long employeeId) {
        return sysEmployeeMapper.selectSysEmployeeById(employeeId);
    }

    /**
     * 查询员工信息列表
     *
     * @param sysEmployee 员工信息
     * @return 员工信息
     */
    @Override
    public List<SysEmployee> selectSysEmployeeList(SysEmployee sysEmployee) {
        return sysEmployeeMapper.selectSysEmployeeList(sysEmployee);
    }

    /**
     * 新增员工信息
     *
     * @param sysEmployee 员工信息
     * @return 结果
     */
    @Override
    public int insertSysEmployee(SysEmployee sysEmployee) {
        return sysEmployeeMapper.insertSysEmployee(sysEmployee);
    }

    /**
     * 修改员工信息
     *
     * @param sysEmployee 员工信息
     * @return 结果
     */
    @Override
    public int updateSysEmployee(SysEmployee sysEmployee) {
        return sysEmployeeMapper.updateSysEmployee(sysEmployee);
    }

    /**
     * 删除员工信息对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysEmployeeByIds(String ids) {
        return sysEmployeeMapper.deleteSysEmployeeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除员工信息信息
     *
     * @param employeeId 员工信息ID
     * @return 结果
     */
    @Override
    public int deleteSysEmployeeById(Long employeeId) {
        return sysEmployeeMapper.deleteSysEmployeeById(employeeId);
    }

    /**
     * 根据姓名查询部门
     *
     * @param employeeId 员工ID
     * @return 部门信息
     */
    @Override
    public SysEmployee selectDeptById(int employeeId) {
        // TODO Auto-generated method stub
        return sysEmployeeMapper.selectDeptById(employeeId);
    }

    /**
     * 获取员工总数
     * @return 员工总数
     */
    @Override
    public String getEmployeeNum(SysEmployee sysEmployee) {
        return sysEmployeeMapper.getEmployeeNum(sysEmployee);
    }

    /**
     * 获取正式员工数量
     * @return 员工数量
     */
    @Override
    public String getFormalEmployeeNum(SysEmployee sysEmployee) {
        return sysEmployeeMapper.getFormalEmployeeNum(sysEmployee);
    }

    /**
     * 获取本月入职的员工数量
     * @return 本月入职员工数量
     */
    @Override
    public String getTisMonthEntryEmployeeNum(SysEmployee sysEmployee) {
        return sysEmployeeMapper.getTisMonthEntryEmployeeNum(sysEmployee);
    }

    /**
     * 获取员工年龄分布情况
     * @return 员工年龄分布情况
     */
    @Override
    public List<SysEmployeeAgeDistribution> getEmployeeAgeDistribution(SysEmployee sysEmployee) {
        return sysEmployeeMapper.getEmployeeAgeDistribution(sysEmployee);
    }

    @Override
    public List<SysEmployeeDegreeDistribution> getEmployeeDegreeDistribution(SysEmployee sysEmployee) {
        return sysEmployeeMapper.getEmployeeDegreeDistribution(sysEmployee);
    }

}
