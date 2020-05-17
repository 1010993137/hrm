package com.hrm.system.service;

import java.util.List;
import com.hrm.system.domain.SysPenalties;

/**
 * 奖惩查询Service接口
 * 
 * @author gaoyang
 * @date 2020-03-22
 */
public interface ISysPenaltiesService 
{
    /**
     * 查询奖惩查询
     * 
     * @param penaltiesId 奖惩查询ID
     * @return 奖惩查询
     */
    public SysPenalties selectSysPenaltiesById(Long penaltiesId);

    /**
     * 查询奖惩查询列表
     * 
     * @param sysPenalties 奖惩查询
     * @return 奖惩查询集合
     */
    public List<SysPenalties> selectSysPenaltiesList(SysPenalties sysPenalties);

    /**
     * 新增奖惩查询
     * 
     * @param sysPenalties 奖惩查询
     * @return 结果
     */
    public int insertSysPenalties(SysPenalties sysPenalties);

    /**
     * 修改奖惩查询
     * 
     * @param sysPenalties 奖惩查询
     * @return 结果
     */
    public int updateSysPenalties(SysPenalties sysPenalties);

    /**
     * 批量删除奖惩查询
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysPenaltiesByIds(String ids);

    /**
     * 删除奖惩查询信息
     * 
     * @param penaltiesId 奖惩查询ID
     * @return 结果
     */
    public int deleteSysPenaltiesById(Long penaltiesId);
}
