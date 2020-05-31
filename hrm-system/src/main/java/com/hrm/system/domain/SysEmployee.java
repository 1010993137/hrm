package com.hrm.system.domain;

import com.hrm.common.core.domain.Ztree;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.hrm.common.annotation.Excel;
import com.hrm.common.core.domain.BaseEntity;
import java.util.Date;
import java.util.List;

/**
 * 员工信息对象 sys_employee
 * 
 * @author gaoyang
 * @date 2020-03-14
 */
public class SysEmployee extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long employeeId;

    /** 员工名称 */
    @Excel(name = "员工名称")
    private String employeeName;

    /** 年龄 */
    @Excel(name = "年龄")
    private Integer employeeAge;

    /** 性别 */
    @Excel(name = "性别")
    private String employeeSex;

    /** 状态 */
    @Excel(name = "状态")
    private String employeeStatus;

    /** 生日 */
    @Excel(name = "生日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date employeeBirthday;

    /** 院校 */
    @Excel(name = "院校")
    private String employeeSchool;

    /** 员工类型 */
    @Excel(name = "员工类型")
    private String employeeType;

    /** 学历 */
    @Excel(name = "学历")
    private String employeeDegree;

    /** 部门 */
    @Excel(name = "部门")
    private String employeeDep;

    /** 职位 */
    @Excel(name = "职位")
    private String employeePost;
    
    /** 入职时间 */
    @Excel(name = "入职时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date employeeEntryDate;

    /** 入职工龄 */
    @Excel(name = "入职工龄")
    private Long employeeEntryLength;

    /** 参加工作时间 */
    @Excel(name = "参加工作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date employeeWorkDate;

    /** 参加工作工龄 */
    @Excel(name = "参加工作工龄")
    private Long employeeWorkLength;

    private List<SysDept> deptList;

    /** 登录人机构ID */
    @Excel(name = "登录人机构ID")
    private Long userDeptId;

    public void setEmployeeId(Long employeeId)
    {
        this.employeeId = employeeId;
    }

    public Long getEmployeeId() 
    {
        return employeeId;
    }
    public void setEmployeeName(String employeeName) 
    {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() 
    {
        return employeeName;
    }
    public void setEmployeeAge(Integer employeeAge) 
    {
        this.employeeAge = employeeAge;
    }

    public Integer getEmployeeAge() 
    {
        return employeeAge;
    }
    public void setEmployeeSex(String employeeSex) 
    {
        this.employeeSex = employeeSex;
    }

    public String getEmployeeSex() 
    {
        return employeeSex;
    }
    public void setEmployeeStatus(String employeeStatus) 
    {
        this.employeeStatus = employeeStatus;
    }

    public String getEmployeeStatus() 
    {
        return employeeStatus;
    }
    public void setEmployeeBirthday(Date employeeBirthday) 
    {
        this.employeeBirthday = employeeBirthday;
    }

    public Date getEmployeeBirthday() 
    {
        return employeeBirthday;
    }
    public void setEmployeeSchool(String employeeSchool) 
    {
        this.employeeSchool = employeeSchool;
    }

    public String getEmployeeSchool() 
    {
        return employeeSchool;
    }
    public void setEmployeeType(String employeeType) 
    {
        this.employeeType = employeeType;
    }

    public String getEmployeeType() 
    {
        return employeeType;
    }
    public void setEmployeeDegree(String employeeDegree) 
    {
        this.employeeDegree = employeeDegree;
    }

    public String getEmployeeDegree() 
    {
        return employeeDegree;
    }
    public void setEmployeeDep(String employeeDep) 
    {
        this.employeeDep = employeeDep;
    }

    public String getEmployeeDep() 
    {
        return employeeDep;
    }
    public void setEmployeePost(String employeePost) 
    {
        this.employeePost = employeePost;
    }

    public String getEmployeePost() 
    {
        return employeePost;
    }
    
    public void setEmployeeEntryDate(Date employeeEntryDate) 
    {
        this.employeeEntryDate = employeeEntryDate;
    }
    
    public Date getEmployeeEntryDate() 
    {
        return employeeEntryDate;
    }
    public void setEmployeeEntryLength(Long employeeEntryLength) 
    {
        this.employeeEntryLength = employeeEntryLength;
    }

    public Long getEmployeeEntryLength() 
    {
        return employeeEntryLength;
    }
    public void setEmployeeWorkDate(Date employeeWorkDate) 
    {
        this.employeeWorkDate = employeeWorkDate;
    }

    public Date getEmployeeWorkDate() 
    {
        return employeeWorkDate;
    }
    public void setEmployeeWorkLength(Long employeeWorkLength) 
    {
        this.employeeWorkLength = employeeWorkLength;
    }

    public Long getEmployeeWorkLength() 
    {
        return employeeWorkLength;
    }

    public List<SysDept> getDeptList() {
        return deptList;
    }

    public void setDeptList(List<SysDept> deptList) {
        this.deptList = deptList;
    }

    public Long getUserDeptId() {
        return userDeptId;
    }

    public void setUserDeptId(Long userDeptId) {
        this.userDeptId = userDeptId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("employeeId", getEmployeeId())
            .append("employeeName", getEmployeeName())
            .append("employeeAge", getEmployeeAge())
            .append("employeeSex", getEmployeeSex())
            .append("employeeStatus", getEmployeeStatus())
            .append("employeeBirthday", getEmployeeBirthday())
            .append("employeeSchool", getEmployeeSchool())
            .append("employeeType", getEmployeeType())
            .append("employeeDegree", getEmployeeDegree())
            .append("employeeDep", getEmployeeDep())
            .append("employeePost", getEmployeePost())
            .append("employeeEntryDate", getEmployeeEntryDate())
            .append("employeeEntryLength", getEmployeeEntryLength())
            .append("employeeWorkDate", getEmployeeWorkDate())
            .append("employeeWorkLength", getEmployeeWorkLength())
            .toString();
    }
}
