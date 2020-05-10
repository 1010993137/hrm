package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 应聘人员信息对象 sys_recruit
 * 
 * @author gaoyang
 * @date 2020-03-20
 */
public class SysRecruit extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 应聘人id */
    private Long recruitId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String recruitName;

    /** 目前状态 */
    @Excel(name = "目前状态")
    private String recruitStatus;

    /** 性别 */
    @Excel(name = "性别")
    private String recruitSex;

    /** 年龄 */
    @Excel(name = "年龄")
    private String recruitAge;

    /** 学历 */
    @Excel(name = "学历")
    private String recruitEducation;

    /** 电话 */
    @Excel(name = "电话")
    private String recruitPhone;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String recruitEmail;

    /** 毕业院校 */
    @Excel(name = "毕业院校")
    private String recruitSchool;

    public void setRecruitId(Long recruitId) 
    {
        this.recruitId = recruitId;
    }

    public Long getRecruitId() 
    {
        return recruitId;
    }
    public void setRecruitName(String recruitName) 
    {
        this.recruitName = recruitName;
    }

    public String getRecruitName() 
    {
        return recruitName;
    }
    public void setRecruitStatus(String recruitStatus) 
    {
        this.recruitStatus = recruitStatus;
    }

    public String getRecruitStatus() 
    {
        return recruitStatus;
    }
    public void setRecruitSex(String recruitSex) 
    {
        this.recruitSex = recruitSex;
    }

    public String getRecruitSex() 
    {
        return recruitSex;
    }
    public void setRecruitAge(String recruitAge) 
    {
        this.recruitAge = recruitAge;
    }

    public String getRecruitAge() 
    {
        return recruitAge;
    }
    public void setRecruitEducation(String recruitEducation) 
    {
        this.recruitEducation = recruitEducation;
    }

    public String getRecruitEducation() 
    {
        return recruitEducation;
    }
    public void setRecruitPhone(String recruitPhone) 
    {
        this.recruitPhone = recruitPhone;
    }

    public String getRecruitPhone() 
    {
        return recruitPhone;
    }
    public void setRecruitEmail(String recruitEmail) 
    {
        this.recruitEmail = recruitEmail;
    }

    public String getRecruitEmail() 
    {
        return recruitEmail;
    }
    public void setRecruitSchool(String recruitSchool) 
    {
        this.recruitSchool = recruitSchool;
    }

    public String getRecruitSchool() 
    {
        return recruitSchool;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("recruitId", getRecruitId())
            .append("recruitName", getRecruitName())
            .append("recruitStatus", getRecruitStatus())
            .append("recruitSex", getRecruitSex())
            .append("recruitAge", getRecruitAge())
            .append("recruitEducation", getRecruitEducation())
            .append("recruitPhone", getRecruitPhone())
            .append("recruitEmail", getRecruitEmail())
            .append("recruitSchool", getRecruitSchool())
            .toString();
    }
}
