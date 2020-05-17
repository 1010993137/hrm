package com.hrm.system.mapper;

import java.util.List;
import com.hrm.system.domain.SysRecruit;

/**
 * 应聘人员信息Mapper接口
 * 
 * @author gaoyang
 * @date 2020-03-20
 */
public interface SysRecruitMapper 
{
    /**
     * 查询应聘人员信息
     * 
     * @param recruitId 应聘人员信息ID
     * @return 应聘人员信息
     */
    public SysRecruit selectSysRecruitById(Long recruitId);

    /**
     * 查询应聘人员信息列表
     * 
     * @param sysRecruit 应聘人员信息
     * @return 应聘人员信息集合
     */
    public List<SysRecruit> selectSysRecruitList(SysRecruit sysRecruit);

    /**
     * 新增应聘人员信息
     * 
     * @param sysRecruit 应聘人员信息
     * @return 结果
     */
    public int insertSysRecruit(SysRecruit sysRecruit);

    /**
     * 修改应聘人员信息
     * 
     * @param sysRecruit 应聘人员信息
     * @return 结果
     */
    public int updateSysRecruit(SysRecruit sysRecruit);

    /**
     * 删除应聘人员信息
     * 
     * @param recruitId 应聘人员信息ID
     * @return 结果
     */
    public int deleteSysRecruitById(Long recruitId);

    /**
     * 批量删除应聘人员信息
     * 
     * @param recruitIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysRecruitByIds(String[] recruitIds);
}
