package com.hrm.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 全局配置类
 * 
 * @author ruoyi
 */
@Component
@ConfigurationProperties(prefix = "ruoyi")
public class Global
{
    /** 项目名称 */
    private static String name;

    /** 版本 */
    private static String version;

    /** 版权年份 */
    private static String copyrightYear;

    /** 实例演示开关 */
    private static boolean demoEnabled;

    /** 上传路径 */
    private static String profile;

    /** 获取地址开关 */
    private static boolean addressEnabled;

    /** MySQL数据库所在服务器地址IP */
    private static String hostIP;
     /** 进入数据库所需要的用户名 */
    private static String userName;
     /** 进入数据库所需要的密码 */
    private static String password;
     /** 数据库导出文件保存路径 */
    private static String savePath;
     /** 要导出的数据库名 */
    private static String databaseName;

    public static String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        Global.name = name;
    }

    public static String getVersion()
    {
        return version;
    }

    public void setVersion(String version)
    {
        Global.version = version;
    }

    public static String getCopyrightYear()
    {
        return copyrightYear;
    }

    public void setCopyrightYear(String copyrightYear)
    {
        Global.copyrightYear = copyrightYear;
    }

    public static boolean isDemoEnabled()
    {
        return demoEnabled;
    }

    public void setDemoEnabled(boolean demoEnabled)
    {
        Global.demoEnabled = demoEnabled;
    }

    public static String getProfile()
    {
        return profile;
    }

    public void setProfile(String profile)
    {
        Global.profile = profile;
    }

    public static boolean isAddressEnabled()
    {
        return addressEnabled;
    }

    public void setAddressEnabled(boolean addressEnabled)
    {
        Global.addressEnabled = addressEnabled;
    }

    /**
     * 获取头像上传路径
     */
    public static String getAvatarPath()
    {
        return getProfile() + "/avatar";
    }

    /**
     * 获取下载路径
     */
    public static String getDownloadPath()
    {
        return getProfile() + "/download/";
    }

    /**
     * 获取上传路径
     */
    public static String getUploadPath()
    {
        return getProfile() + "/upload";
    }

    public static String getHostIP() {
        return hostIP;
    }

    public static void setHostIP(String hostIP) {
        Global.hostIP = hostIP;
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        Global.userName = userName;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Global.password = password;
    }

    public static String getSavePath() {
        return savePath;
    }

    public static void setSavePath(String savePath) {
        Global.savePath = savePath;
    }

    public static String getDatabaseName() {
        return databaseName;
    }

    public static void setDatabaseName(String databaseName) {
        Global.databaseName = databaseName;
    }
}
