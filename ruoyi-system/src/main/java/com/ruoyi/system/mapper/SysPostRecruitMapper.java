package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysPostRecruit;

/**
 * 招聘岗位管理Mapper接口
 * 
 * @author gaoyang
 * @date 2020-03-21
 */
public interface SysPostRecruitMapper 
{
    /**
     * 查询招聘岗位管理
     * 
     * @param postRecruitId 招聘岗位管理ID
     * @return 招聘岗位管理
     */
    public SysPostRecruit selectSysPostRecruitById(Long postRecruitId);

    /**
     * 查询招聘岗位管理列表
     * 
     * @param sysPostRecruit 招聘岗位管理
     * @return 招聘岗位管理集合
     */
    public List<SysPostRecruit> selectSysPostRecruitList(SysPostRecruit sysPostRecruit);

    /**
     * 新增招聘岗位管理
     * 
     * @param sysPostRecruit 招聘岗位管理
     * @return 结果
     */
    public int insertSysPostRecruit(SysPostRecruit sysPostRecruit);

    /**
     * 修改招聘岗位管理
     * 
     * @param sysPostRecruit 招聘岗位管理
     * @return 结果
     */
    public int updateSysPostRecruit(SysPostRecruit sysPostRecruit);

    /**
     * 删除招聘岗位管理
     * 
     * @param postRecruitId 招聘岗位管理ID
     * @return 结果
     */
    public int deleteSysPostRecruitById(Long postRecruitId);

    /**
     * 批量删除招聘岗位管理
     * 
     * @param postRecruitIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysPostRecruitByIds(String[] postRecruitIds);
}
