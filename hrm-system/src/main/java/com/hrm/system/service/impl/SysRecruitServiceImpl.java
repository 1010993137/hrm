package com.hrm.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hrm.system.mapper.SysRecruitMapper;
import com.hrm.system.domain.SysRecruit;
import com.hrm.system.service.ISysRecruitService;
import com.hrm.common.core.text.Convert;

/**
 * 应聘人员信息Service业务层处理
 * 
 * @author gaoyang
 * @date 2020-03-20
 */
@Service
public class SysRecruitServiceImpl implements ISysRecruitService 
{
    @Autowired
    private SysRecruitMapper sysRecruitMapper;

    /**
     * 查询应聘人员信息
     * 
     * @param recruitId 应聘人员信息ID
     * @return 应聘人员信息
     */
    @Override
    public SysRecruit selectSysRecruitById(Long recruitId)
    {
        return sysRecruitMapper.selectSysRecruitById(recruitId);
    }

    /**
     * 查询应聘人员信息列表
     * 
     * @param sysRecruit 应聘人员信息
     * @return 应聘人员信息
     */
    @Override
    public List<SysRecruit> selectSysRecruitList(SysRecruit sysRecruit)
    {
        return sysRecruitMapper.selectSysRecruitList(sysRecruit);
    }

    /**
     * 新增应聘人员信息
     * 
     * @param sysRecruit 应聘人员信息
     * @return 结果
     */
    @Override
    public int insertSysRecruit(SysRecruit sysRecruit)
    {
        return sysRecruitMapper.insertSysRecruit(sysRecruit);
    }

    /**
     * 修改应聘人员信息
     * 
     * @param sysRecruit 应聘人员信息
     * @return 结果
     */
    @Override
    public int updateSysRecruit(SysRecruit sysRecruit)
    {
        return sysRecruitMapper.updateSysRecruit(sysRecruit);
    }

    /**
     * 删除应聘人员信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysRecruitByIds(String ids)
    {
        return sysRecruitMapper.deleteSysRecruitByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除应聘人员信息信息
     * 
     * @param recruitId 应聘人员信息ID
     * @return 结果
     */
    @Override
    public int deleteSysRecruitById(Long recruitId)
    {
        return sysRecruitMapper.deleteSysRecruitById(recruitId);
    }
}
