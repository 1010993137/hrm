package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.SysEmployeeAgeDistribution;
import com.ruoyi.system.domain.SysEmployeeDegreeDistribution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysEmployeeMapper;
import com.ruoyi.system.domain.SysEmployee;
import com.ruoyi.system.service.ISysEmployeeService;
import com.ruoyi.common.core.text.Convert;

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
     * @param employeeName 员工姓名
     * @return 部门信息
     */
    @Override
    public SysEmployee selectDeptByName(String employeeName) {
        // TODO Auto-generated method stub
        return sysEmployeeMapper.selectDeptByName(employeeName);
    }

    /**
     * 获取员工总数
     * @return 员工总数
     */
    @Override
    public String getEmployeeNum() {
        return sysEmployeeMapper.getEmployeeNum();
    }

    /**
     * 获取正式员工数量
     * @return 员工数量
     */
    @Override
    public String getFormalEmployeeNum() {
        return sysEmployeeMapper.getFormalEmployeeNum();
    }

    /**
     * 获取本月入职的员工数量
     * @return 本月入职员工数量
     */
    @Override
    public String getTisMonthEntryEmployeeNum() {
        return sysEmployeeMapper.getTisMonthEntryEmployeeNum();
    }

    /**
     * 获取员工年龄分布情况
     * @return 员工年龄分布情况
     */
    @Override
    public List<SysEmployeeAgeDistribution> getEmployeeAgeDistribution() {
        return sysEmployeeMapper.getEmployeeAgeDistribution();
    }

    @Override
    public List<SysEmployeeDegreeDistribution> getEmployeeDegreeDistribution() {
        return sysEmployeeMapper.getEmployeeDegreeDistribution();
    }

}
