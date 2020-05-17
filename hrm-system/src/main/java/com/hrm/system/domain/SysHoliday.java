package com.hrm.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.hrm.common.annotation.Excel;
import com.hrm.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 请假条目管理对象 sys_holiday
 * 
 * @author gaoyang
 * @date 2020-03-21
 */
public class SysHoliday extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long holidayId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String holidayName;

    /** 部门 */
    @Excel(name = "部门")
    private String holidayDept;

    /** 请假理由 */
    @Excel(name = "请假理由")
    private String holidayResion;

    /** 请假时间 */
    @Excel(name = "请假时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date holidayDate;

    /** 天数 */
    @Excel(name = "天数")
    private Long holidayDay;

    /** 备注 */
    @Excel(name = "备注")
    private String holidayRemark;

    public void setHolidayId(Long holidayId) 
    {
        this.holidayId = holidayId;
    }

    public Long getHolidayId() 
    {
        return holidayId;
    }
    public void setHolidayName(String holidayName) 
    {
        this.holidayName = holidayName;
    }

    public String getHolidayName() 
    {
        return holidayName;
    }
    public void setHolidayDept(String holidayDept) 
    {
        this.holidayDept = holidayDept;
    }

    public String getHolidayDept() 
    {
        return holidayDept;
    }
    public void setHolidayResion(String holidayResion) 
    {
        this.holidayResion = holidayResion;
    }

    public String getHolidayResion() 
    {
        return holidayResion;
    }
    public void setHolidayDate(Date holidayDate) 
    {
        this.holidayDate = holidayDate;
    }

    public Date getHolidayDate() 
    {
        return holidayDate;
    }
    public void setHolidayDay(Long holidayDay) 
    {
        this.holidayDay = holidayDay;
    }

    public Long getHolidayDay() 
    {
        return holidayDay;
    }
    public void setHolidayRemark(String holidayRemark) 
    {
        this.holidayRemark = holidayRemark;
    }

    public String getHolidayRemark() 
    {
        return holidayRemark;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("holidayId", getHolidayId())
            .append("holidayName", getHolidayName())
            .append("holidayDept", getHolidayDept())
            .append("holidayResion", getHolidayResion())
            .append("holidayDate", getHolidayDate())
            .append("holidayDay", getHolidayDay())
            .append("holidayRemark", getHolidayRemark())
            .toString();
    }
}
