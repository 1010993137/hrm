package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysSalaryMapper;
import com.ruoyi.system.domain.SysSalary;
import com.ruoyi.system.service.ISysSalaryService;
import com.ruoyi.common.core.text.Convert;

/**
 * 薪资管理Service业务层处理
 * 
 * @author gaoyang
 * @date 2020-03-22
 */
@Service
public class SysSalaryServiceImpl implements ISysSalaryService 
{
    @Autowired
    private SysSalaryMapper sysSalaryMapper;

    /**
     * 查询薪资管理
     * 
     * @param salaryId 薪资管理ID
     * @return 薪资管理
     */
    @Override
    public SysSalary selectSysSalaryById(Long salaryId)
    {
        return sysSalaryMapper.selectSysSalaryById(salaryId);
    }

    /**
     * 查询薪资管理列表
     * 
     * @param sysSalary 薪资管理
     * @return 薪资管理
     */
    @Override
    public List<SysSalary> selectSysSalaryList(SysSalary sysSalary)
    {
        return sysSalaryMapper.selectSysSalaryList(sysSalary);
    }

    /**
     * 新增薪资管理
     * 
     * @param sysSalary 薪资管理
     * @return 结果
     */
    @Override
    public int insertSysSalary(SysSalary sysSalary)
    {
        return sysSalaryMapper.insertSysSalary(sysSalary);
    }

    /**
     * 修改薪资管理
     * 
     * @param sysSalary 薪资管理
     * @return 结果
     */
    @Override
    public int updateSysSalary(SysSalary sysSalary)
    {
        return sysSalaryMapper.updateSysSalary(sysSalary);
    }

    /**
     * 删除薪资管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysSalaryByIds(String ids)
    {
        return sysSalaryMapper.deleteSysSalaryByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除薪资管理信息
     * 
     * @param salaryId 薪资管理ID
     * @return 结果
     */
    @Override
    public int deleteSysSalaryById(Long salaryId)
    {
        return sysSalaryMapper.deleteSysSalaryById(salaryId);
    }
}
