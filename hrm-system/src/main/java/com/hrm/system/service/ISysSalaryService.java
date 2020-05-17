package com.hrm.system.service;

import java.util.List;
import com.hrm.system.domain.SysSalary;

/**
 * 薪资管理Service接口
 * 
 * @author gaoyang
 * @date 2020-03-22
 */
public interface ISysSalaryService 
{
    /**
     * 查询薪资管理
     * 
     * @param salaryId 薪资管理ID
     * @return 薪资管理
     */
    public SysSalary selectSysSalaryById(Long salaryId);

    /**
     * 查询薪资管理列表
     * 
     * @param sysSalary 薪资管理
     * @return 薪资管理集合
     */
    public List<SysSalary> selectSysSalaryList(SysSalary sysSalary);

    /**
     * 新增薪资管理
     * 
     * @param sysSalary 薪资管理
     * @return 结果
     */
    public int insertSysSalary(SysSalary sysSalary);

    /**
     * 修改薪资管理
     * 
     * @param sysSalary 薪资管理
     * @return 结果
     */
    public int updateSysSalary(SysSalary sysSalary);

    /**
     * 批量删除薪资管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysSalaryByIds(String ids);

    /**
     * 删除薪资管理信息
     * 
     * @param salaryId 薪资管理ID
     * @return 结果
     */
    public int deleteSysSalaryById(Long salaryId);
}
