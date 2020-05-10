package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysPenalties;

/**
 * 奖惩查询Mapper接口
 * 
 * @author gaoyang
 * @date 2020-03-22
 */
public interface SysPenaltiesMapper 
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
     * 删除奖惩查询
     * 
     * @param penaltiesId 奖惩查询ID
     * @return 结果
     */
    public int deleteSysPenaltiesById(Long penaltiesId);

    /**
     * 批量删除奖惩查询
     * 
     * @param penaltiesIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysPenaltiesByIds(String[] penaltiesIds);
}
