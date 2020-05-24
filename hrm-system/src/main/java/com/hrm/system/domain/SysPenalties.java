package com.hrm.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.hrm.common.annotation.Excel;
import com.hrm.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 奖惩查询对象 sys_penalties
 * 
 * @author gaoyang
 * @date 2020-03-22
 */
public class SysPenalties extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long penaltiesId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String penaltiesName;

    /** 部门 */
    @Excel(name = "部门")
    private String penaltiesDept;

    /** 奖惩类型 */
    @Excel(name = "奖惩类型")
    private String penaltiesType;

    /** 奖惩原因 */
    @Excel(name = "奖惩原因")
    private String penaltiesResion;

    /** 奖惩金额 */
    @Excel(name = "奖惩金额")
    private Long penaltiesAmount;

    /** 奖惩日期 */
    @Excel(name = "奖惩日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date penaltiesDate;

    /** 奖惩起始日期 */
    @Excel(name = "起始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 奖惩結束日期 */
    @Excel(name = "結束日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;


    public void setPenaltiesId(Long penaltiesId) 
    {
        this.penaltiesId = penaltiesId;
    }

    public Long getPenaltiesId() 
    {
        return penaltiesId;
    }
    public void setPenaltiesName(String penaltiesName) 
    {
        this.penaltiesName = penaltiesName;
    }

    public String getPenaltiesName() 
    {
        return penaltiesName;
    }
    public void setPenaltiesDept(String penaltiesDept) 
    {
        this.penaltiesDept = penaltiesDept;
    }

    public String getPenaltiesDept() 
    {
        return penaltiesDept;
    }
    public void setPenaltiesType(String penaltiesType) 
    {
        this.penaltiesType = penaltiesType;
    }

    public String getPenaltiesType() 
    {
        return penaltiesType;
    }
    public void setPenaltiesResion(String penaltiesResion) 
    {
        this.penaltiesResion = penaltiesResion;
    }

    public String getPenaltiesResion() 
    {
        return penaltiesResion;
    }
    public void setPenaltiesAmount(Long penaltiesAmount) 
    {
        this.penaltiesAmount = penaltiesAmount;
    }

    public Long getPenaltiesAmount() 
    {
        return penaltiesAmount;
    }
    public void setPenaltiesDate(Date penaltiesDate) 
    {
        this.penaltiesDate = penaltiesDate;
    }

    public Date getPenaltiesDate() 
    {
        return penaltiesDate;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("penaltiesId", getPenaltiesId())
            .append("penaltiesName", getPenaltiesName())
            .append("penaltiesDept", getPenaltiesDept())
            .append("penaltiesType", getPenaltiesType())
            .append("penaltiesResion", getPenaltiesResion())
            .append("penaltiesAmount", getPenaltiesAmount())
            .append("penaltiesDate", getPenaltiesDate())
            .toString();
    }
}
