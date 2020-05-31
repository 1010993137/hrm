package com.hrm.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.hrm.common.annotation.Excel;
import com.hrm.common.core.domain.BaseEntity;

import java.util.List;

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
    @Excel(name = "员工Id")
    private int salaryEmpId;

    /** 部门 */
    @Excel(name = "部门Id")
    private String salaryDept;


    /** 底薪 */
    @Excel(name = "底薪")
    private Long salaryAmount;


    /** 员工姓名 */
    @Excel(name = "员工姓名")
    private String salaryEmpName;

    /** 登录人管理结构 */
    private List<SysDept> deptList;

    public void setSalaryId(Long salaryId) 
    {
        this.salaryId = salaryId;
    }

    public Long getSalaryId() 
    {
        return salaryId;
    }

    public String getSalaryEmpName() {
        return salaryEmpName;
    }

    public void setSalaryEmpName(String salaryEmpName) {
        this.salaryEmpName = salaryEmpName;
    }

    public int getSalaryEmpId() {
        return salaryEmpId;
    }

    public String getSalaryDept() {
        return salaryDept;
    }

    public void setSalaryDept(String salaryDept) {
        this.salaryDept = salaryDept;
    }

    public void setSalaryEmpId(int salaryEmpId) {
        this.salaryEmpId = salaryEmpId;
    }

    public void setSalaryAmount(Long salaryAmount)
    {
        this.salaryAmount = salaryAmount;
    }

    public Long getSalaryAmount() 
    {
        return salaryAmount;
    }

    public List<SysDept> getDeptList() {
        return deptList;
    }

    public void setDeptList(List<SysDept> deptList) {
        this.deptList = deptList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("salaryId", getSalaryId())
            .append("salaryAmount", getSalaryAmount())
            .toString();
    }
}
