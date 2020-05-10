package com.ruoyi.system.domain;

import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 年龄分布情况实体类
 **/
public class SysEmployeeAgeDistribution {
    //年龄分布范围
    private String employeeAge;
    //数量
    private String employeeAgeCount;

    public String getEmployeeAgeCount() {
        return employeeAgeCount;
    }

    public void setEmployeeAgeCount(String employeeAgeCount) {
        this.employeeAgeCount = employeeAgeCount;
    }

    public String getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(String employeeAge) {
        this.employeeAge = employeeAge;
    }

    @Override
    public String toString() {
        return "SysEmployeeAgeDistribution{" +
                "employeeAge='" + employeeAge + '\'' +
                ", employeeAgeCount='" + employeeAgeCount + '\'' +
                '}';
    }


}
