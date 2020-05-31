package com.hrm.system.service.impl;

import com.hrm.system.domain.SysCharts;
import com.hrm.system.domain.SysDept;
import com.hrm.system.mapper.SysChartsMapper;
import com.hrm.system.service.ISysChartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ISysChartsServiceImpl implements ISysChartsService {
    @Autowired
    SysChartsMapper sysChartsMapper;

    @Override
    @Transactional
    public Map<String,List<SysCharts>> getResignationNumAndPostNum(SysCharts sysCharts) {
        List<SysCharts> resignationNum = sysChartsMapper.getResignationNum(sysCharts);
        List<SysCharts> postNum = sysChartsMapper.getPostNum(sysCharts);
        Map<String,List<SysCharts>> resignationNumAndPostNum = new HashMap<String,List<SysCharts>>();
        resignationNumAndPostNum.put("resignationNum",resignationNum);
        resignationNumAndPostNum.put("postNum",postNum);
        return resignationNumAndPostNum;
    }
}
