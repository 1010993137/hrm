package com.hrm.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.hrm.common.annotation.Excel;
import com.hrm.common.core.domain.BaseEntity;

/**
 * 招聘岗位管理对象 sys_post_recruit
 * 
 * @author gaoyang
 * @date 2020-03-21
 */
public class SysPostRecruit extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long postRecruitId;

    /** 岗位名 */
    @Excel(name = "岗位名")
    private String postRecruitName;

    /** 招聘人数 */
    @Excel(name = "招聘人数")
    private Long postRecruitNum;

    /** 最低学历 */
    @Excel(name = "最低学历")
    private String postRecruitEducation;

    /** 详细要求 */
    @Excel(name = "详细要求")
    private String postRecruitRemark;

    public void setPostRecruitId(Long postRecruitId) 
    {
        this.postRecruitId = postRecruitId;
    }

    public Long getPostRecruitId() 
    {
        return postRecruitId;
    }
    public void setPostRecruitName(String postRecruitName) 
    {
        this.postRecruitName = postRecruitName;
    }

    public String getPostRecruitName() 
    {
        return postRecruitName;
    }
    public void setPostRecruitNum(Long postRecruitNum) 
    {
        this.postRecruitNum = postRecruitNum;
    }

    public Long getPostRecruitNum() 
    {
        return postRecruitNum;
    }
    public void setPostRecruitEducation(String postRecruitEducation) 
    {
        this.postRecruitEducation = postRecruitEducation;
    }

    public String getPostRecruitEducation() 
    {
        return postRecruitEducation;
    }
    public void setPostRecruitRemark(String postRecruitRemark) 
    {
        this.postRecruitRemark = postRecruitRemark;
    }

    public String getPostRecruitRemark() 
    {
        return postRecruitRemark;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("postRecruitId", getPostRecruitId())
            .append("postRecruitName", getPostRecruitName())
            .append("postRecruitNum", getPostRecruitNum())
            .append("postRecruitEducation", getPostRecruitEducation())
            .append("postRecruitRemark", getPostRecruitRemark())
            .toString();
    }
}
