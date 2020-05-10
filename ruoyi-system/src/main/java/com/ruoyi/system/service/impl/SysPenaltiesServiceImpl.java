package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysPenaltiesMapper;
import com.ruoyi.system.domain.SysPenalties;
import com.ruoyi.system.service.ISysPenaltiesService;
import com.ruoyi.common.core.text.Convert;

/**
 * 奖惩查询Service业务层处理
 * 
 * @author gaoyang
 * @date 2020-03-22
 */
@Service
public class SysPenaltiesServiceImpl implements ISysPenaltiesService 
{
    @Autowired
    private SysPenaltiesMapper sysPenaltiesMapper;

    /**
     * 查询奖惩查询
     * 
     * @param penaltiesId 奖惩查询ID
     * @return 奖惩查询
     */
    @Override
    public SysPenalties selectSysPenaltiesById(Long penaltiesId)
    {
        return sysPenaltiesMapper.selectSysPenaltiesById(penaltiesId);
    }

    /**
     * 查询奖惩查询列表
     * 
     * @param sysPenalties 奖惩查询
     * @return 奖惩查询
     */
    @Override
    public List<SysPenalties> selectSysPenaltiesList(SysPenalties sysPenalties)
    {
        return sysPenaltiesMapper.selectSysPenaltiesList(sysPenalties);
    }

    /**
     * 新增奖惩查询
     * 
     * @param sysPenalties 奖惩查询
     * @return 结果
     */
    @Override
    public int insertSysPenalties(SysPenalties sysPenalties)
    {
        return sysPenaltiesMapper.insertSysPenalties(sysPenalties);
    }

    /**
     * 修改奖惩查询
     * 
     * @param sysPenalties 奖惩查询
     * @return 结果
     */
    @Override
    public int updateSysPenalties(SysPenalties sysPenalties)
    {
        return sysPenaltiesMapper.updateSysPenalties(sysPenalties);
    }

    /**
     * 删除奖惩查询对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysPenaltiesByIds(String ids)
    {
        return sysPenaltiesMapper.deleteSysPenaltiesByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除奖惩查询信息
     * 
     * @param penaltiesId 奖惩查询ID
     * @return 结果
     */
    @Override
    public int deleteSysPenaltiesById(Long penaltiesId)
    {
        return sysPenaltiesMapper.deleteSysPenaltiesById(penaltiesId);
    }
}
