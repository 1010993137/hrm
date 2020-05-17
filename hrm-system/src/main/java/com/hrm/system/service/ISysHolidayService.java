package com.hrm.system.service;

import java.util.List;
import com.hrm.system.domain.SysHoliday;

/**
 * 请假条目管理Service接口
 * 
 * @author gaoyang
 * @date 2020-03-21
 */
public interface ISysHolidayService 
{
    /**
     * 查询请假条目管理
     * 
     * @param holidayId 请假条目管理ID
     * @return 请假条目管理
     */
    public SysHoliday selectSysHolidayById(Long holidayId);

    /**
     * 查询请假条目管理列表
     * 
     * @param sysHoliday 请假条目管理
     * @return 请假条目管理集合
     */
    public List<SysHoliday> selectSysHolidayList(SysHoliday sysHoliday);

    /**
     * 新增请假条目管理
     * 
     * @param sysHoliday 请假条目管理
     * @return 结果
     */
    public int insertSysHoliday(SysHoliday sysHoliday);

    /**
     * 修改请假条目管理
     * 
     * @param sysHoliday 请假条目管理
     * @return 结果
     */
    public int updateSysHoliday(SysHoliday sysHoliday);

    /**
     * 批量删除请假条目管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysHolidayByIds(String ids);

    /**
     * 删除请假条目管理信息
     * 
     * @param holidayId 请假条目管理ID
     * @return 结果
     */
    public int deleteSysHolidayById(Long holidayId);
}
