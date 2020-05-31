package com.hrm.system.mapper;

import com.hrm.system.domain.SysCharts;
import com.hrm.system.domain.SysDept;

import java.util.List;

public interface SysChartsMapper {

    List<SysCharts> getResignationNum(SysCharts sysCharts);

    List<SysCharts> getPostNum(SysCharts sysCharts);


}
