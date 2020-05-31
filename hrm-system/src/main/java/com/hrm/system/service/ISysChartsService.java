package com.hrm.system.service;

import com.hrm.system.domain.SysCharts;

import java.util.List;
import java.util.Map;

public interface ISysChartsService {

    /**
     * 获取离职数量和职位需求数量
     * @return
     */
    public Map<String,List<SysCharts>> getResignationNumAndPostNum(SysCharts sysCharts);
}
