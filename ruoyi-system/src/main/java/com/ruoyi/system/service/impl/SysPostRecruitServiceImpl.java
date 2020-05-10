package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysPostRecruitMapper;
import com.ruoyi.system.domain.SysPostRecruit;
import com.ruoyi.system.service.ISysPostRecruitService;
import com.ruoyi.common.core.text.Convert;

/**
 * 招聘岗位管理Service业务层处理
 * 
 * @author gaoyang
 * @date 2020-03-21
 */
@Service
public class SysPostRecruitServiceImpl implements ISysPostRecruitService 
{
    @Autowired
    private SysPostRecruitMapper sysPostRecruitMapper;

    /**
     * 查询招聘岗位管理
     * 
     * @param postRecruitId 招聘岗位管理ID
     * @return 招聘岗位管理
     */
    @Override
    public SysPostRecruit selectSysPostRecruitById(Long postRecruitId)
    {
        return sysPostRecruitMapper.selectSysPostRecruitById(postRecruitId);
    }

    /**
     * 查询招聘岗位管理列表
     * 
     * @param sysPostRecruit 招聘岗位管理
     * @return 招聘岗位管理
     */
    @Override
    public List<SysPostRecruit> selectSysPostRecruitList(SysPostRecruit sysPostRecruit)
    {
        return sysPostRecruitMapper.selectSysPostRecruitList(sysPostRecruit);
    }

    /**
     * 新增招聘岗位管理
     * 
     * @param sysPostRecruit 招聘岗位管理
     * @return 结果
     */
    @Override
    public int insertSysPostRecruit(SysPostRecruit sysPostRecruit)
    {
        return sysPostRecruitMapper.insertSysPostRecruit(sysPostRecruit);
    }

    /**
     * 修改招聘岗位管理
     * 
     * @param sysPostRecruit 招聘岗位管理
     * @return 结果
     */
    @Override
    public int updateSysPostRecruit(SysPostRecruit sysPostRecruit)
    {
        return sysPostRecruitMapper.updateSysPostRecruit(sysPostRecruit);
    }

    /**
     * 删除招聘岗位管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysPostRecruitByIds(String ids)
    {
        return sysPostRecruitMapper.deleteSysPostRecruitByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除招聘岗位管理信息
     * 
     * @param postRecruitId 招聘岗位管理ID
     * @return 结果
     */
    @Override
    public int deleteSysPostRecruitById(Long postRecruitId)
    {
        return sysPostRecruitMapper.deleteSysPostRecruitById(postRecruitId);
    }
}
