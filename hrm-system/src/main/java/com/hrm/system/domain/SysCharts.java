package com.hrm.system.domain;

import java.util.List;

/**
 * @author hou_fz
 * @version 1.0
 * @描述: 数据分析表模块
 * @公司: 济南广域软件
 * @创建日期： 2020/5/31
 * @修改人：
 * @修改日期：
 * @Copyright: Copyright (c) Jnwat Soft 2020
 * @备注：
 **/
public class SysCharts {
    /** 部门名称*/
    private String deptName;
    /** 离职数量*/
    private String resignationNum;
    /** 职位名称*/
    private String postRecruitName;
    /** 职位需求数量*/
    private String postNum;

    private List<SysDept> deptList;


    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getResignationNum() {
        return resignationNum;
    }

    public void setResignationNum(String resignationNum) {
        this.resignationNum = resignationNum;
    }

    public String getPostRecruitName() {
        return postRecruitName;
    }

    public void setPostRecruitName(String postRecruitName) {
        this.postRecruitName = postRecruitName;
    }

    public String getPostNum() {
        return postNum;
    }

    public void setPostNum(String postNum) {
        this.postNum = postNum;
    }

    public List<SysDept> getDeptList() {
        return deptList;
    }

    public void setDeptList(List<SysDept> deptList) {
        this.deptList = deptList;
    }

    @Override
    public String toString() {
        return "SysCharts{" +
                "deptName='" + deptName + '\'' +
                ", resignationNum='" + resignationNum + '\'' +
                ", postRecruitName='" + postRecruitName + '\'' +
                ", postNum='" + postNum + '\'' +
                ", deptList=" + deptList +
                '}';
    }
}
