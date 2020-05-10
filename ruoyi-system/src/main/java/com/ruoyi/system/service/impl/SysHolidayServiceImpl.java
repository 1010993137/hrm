package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysHolidayMapper;
import com.ruoyi.system.domain.SysHoliday;
import com.ruoyi.system.service.ISysHolidayService;
import com.ruoyi.common.core.text.Convert;

/**
 * 请假条目管理Service业务层处理
 * 
 * @author gaoyang
 * @date 2020-03-21
 */
@Service
public class SysHolidayServiceImpl implements ISysHolidayService 
{
    @Autowired
    private SysHolidayMapper sysHolidayMapper;

    /**
     * 查询请假条目管理
     * 
     * @param holidayId 请假条目管理ID
     * @return 请假条目管理
     */
    @Override
    public SysHoliday selectSysHolidayById(Long holidayId)
    {
        return sysHolidayMapper.selectSysHolidayById(holidayId);
    }

    /**
     * 查询请假条目管理列表
     * 
     * @param sysHoliday 请假条目管理
     * @return 请假条目管理
     */
    @Override
    public List<SysHoliday> selectSysHolidayList(SysHoliday sysHoliday)
    {
        return sysHolidayMapper.selectSysHolidayList(sysHoliday);
    }

    /**
     * 新增请假条目管理
     * 
     * @param sysHoliday 请假条目管理
     * @return 结果
     */
    @Override
    public int insertSysHoliday(SysHoliday sysHoliday)
    {
        return sysHolidayMapper.insertSysHoliday(sysHoliday);
    }

    /**
     * 修改请假条目管理
     * 
     * @param sysHoliday 请假条目管理
     * @return 结果
     */
    @Override
    public int updateSysHoliday(SysHoliday sysHoliday)
    {
        return sysHolidayMapper.updateSysHoliday(sysHoliday);
    }

    /**
     * 删除请假条目管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysHolidayByIds(String ids)
    {
        return sysHolidayMapper.deleteSysHolidayByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除请假条目管理信息
     * 
     * @param holidayId 请假条目管理ID
     * @return 结果
     */
    @Override
    public int deleteSysHolidayById(Long holidayId)
    {
        return sysHolidayMapper.deleteSysHolidayById(holidayId);
    }
}
