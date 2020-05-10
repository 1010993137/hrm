package com.ruoyi.system.domain;

/**
 * 员工学历分布情况
 **/
public class SysEmployeeDegreeDistribution {
    private String employeeDegree;
    private String employeeDegreeNum;

    public String getEmployeeDegree() {
        return employeeDegree;
    }

    public void setEmployeeDegree(String employeeDegree) {
        this.employeeDegree = employeeDegree;
    }

    public String getEmployeeDegreeNum() {
        return employeeDegreeNum;
    }

    public void setEmployeeDegreeNum(String employeeDegreeNum) {
        this.employeeDegreeNum = employeeDegreeNum;
    }

    @Override
    public String toString() {
        return "SysEmployeeDegreeDistribution{" +
                "employeeDegree='" + employeeDegree + '\'' +
                ", employeeDegreeNum='" + employeeDegreeNum + '\'' +
                '}';
    }

}
