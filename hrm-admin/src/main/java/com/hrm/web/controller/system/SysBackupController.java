package com.hrm.web.controller.system;

import com.hrm.common.config.Global;
import com.hrm.common.core.domain.AjaxResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.hrm.common.utils.MySQLDatabaseBackup.exportDatabaseTool;

@Controller
@RequestMapping("/backup")
public class SysBackupController {

    @RequestMapping()
    public String backup() {
        return "/system/backup/backupindex";
    }

    @ResponseBody
    @RequestMapping(value = "/backupDB",method = RequestMethod.POST)
    public AjaxResult backupDB(String fileName) {
        try {
            exportDatabaseTool(Global.getHostIP(), Global.getUserName(), Global.getPassword(), Global.getSavePath(), fileName, Global.getDatabaseName());
        } catch (InterruptedException e) {
            e.printStackTrace();
            AjaxResult.error("服务器内部错误");
        }
        return AjaxResult.success("备份成功");
    }


}
