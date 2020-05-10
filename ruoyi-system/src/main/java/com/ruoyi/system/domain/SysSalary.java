package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 薪资管理对象 sys_salary
 * 
 * @author gaoyang
 * @date 2020-03-22
 */
public class SysSalary extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long salaryId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String salaryName;

    /** 部门 */
    @Excel(name = "部门")
    private String salaryDept;

    /** 底薪 */
    @Excel(name = "底薪")
    private Long salaryAmount;

    public void setSalaryId(Long salaryId) 
    {
        this.salaryId = salaryId;
    }

    public Long getSalaryId() 
    {
        return salaryId;
    }
    public void setSalaryName(String salaryName) 
    {
        this.salaryName = salaryName;
    }

    public String getSalaryName() 
    {
        return salaryName;
    }
    public void setSalaryDept(String salaryDept) 
    {
        this.salaryDept = salaryDept;
    }

    public String getSalaryDept() 
    {
        return salaryDept;
    }
    public void setSalaryAmount(Long salaryAmount) 
    {
        this.salaryAmount = salaryAmount;
    }

    public Long getSalaryAmount() 
    {
        return salaryAmount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("salaryId", getSalaryId())
            .append("salaryName", getSalaryName())
            .append("salaryDept", getSalaryDept())
            .append("salaryAmount", getSalaryAmount())
            .toString();
    }
}
