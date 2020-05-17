package com.hrm.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hrm.common.annotation.Log;
import com.hrm.common.enums.BusinessType;
import com.hrm.system.domain.SysHoliday;
import com.hrm.system.service.ISysEmployeeService;
import com.hrm.system.service.ISysHolidayService;
import com.hrm.common.core.controller.BaseController;
import com.hrm.common.core.domain.AjaxResult;
import com.hrm.common.utils.poi.ExcelUtil;
import com.hrm.common.core.page.TableDataInfo;

/**
 * 请假条目管理Controller
 * 
 * @author gaoyang
 * @date 2020-03-21
 */
@Controller
@RequestMapping("/system/holiday")
public class SysHolidayController extends BaseController
{
    private String prefix = "system/holiday";

    @Autowired
    private ISysHolidayService sysHolidayService;
    @Autowired
    private ISysEmployeeService sysEmployeeService;

    @RequiresPermissions("system:holiday:view")
    @GetMapping()
    public String holiday()
    {
        return prefix + "/holiday";
    }

    /**
     * 查询请假条目管理列表
     */
    @RequiresPermissions("system:holiday:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysHoliday sysHoliday)
    {
        startPage();
        List<SysHoliday> list = sysHolidayService.selectSysHolidayList(sysHoliday);
        return getDataTable(list);
    }

    /**
     * 导出请假条目管理列表
     */
    @RequiresPermissions("system:holiday:export")
    @Log(title = "请假条目管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysHoliday sysHoliday)
    {
        List<SysHoliday> list = sysHolidayService.selectSysHolidayList(sysHoliday);
        ExcelUtil<SysHoliday> util = new ExcelUtil<SysHoliday>(SysHoliday.class);
        return util.exportExcel(list, "holiday");
    }

    /**
     * 新增请假条目管理
     */
    @GetMapping("/add")
    public String add(ModelMap mmap)
    {
    	mmap.put("names", sysEmployeeService.selectEmployeeAll());
        return prefix + "/add";
    }

    /**
     * 新增保存请假条目管理
     */
    @RequiresPermissions("system:holiday:add")
    @Log(title = "请假条目管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysHoliday sysHoliday)
    {
        return toAjax(sysHolidayService.insertSysHoliday(sysHoliday));
    }

    /**
     * 修改请假条目管理
     */
    @GetMapping("/edit/{holidayId}")
    public String edit(@PathVariable("holidayId") Long holidayId, ModelMap mmap)
    {
        SysHoliday sysHoliday = sysHolidayService.selectSysHolidayById(holidayId);
        mmap.put("sysHoliday", sysHoliday);
        return prefix + "/edit";
    }

    /**
     * 修改保存请假条目管理
     */
    @RequiresPermissions("system:holiday:edit")
    @Log(title = "请假条目管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysHoliday sysHoliday)
    {
        return toAjax(sysHolidayService.updateSysHoliday(sysHoliday));
    }

    /**
     * 删除请假条目管理
     */
    @RequiresPermissions("system:holiday:remove")
    @Log(title = "请假条目管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysHolidayService.deleteSysHolidayByIds(ids));
    }
}
