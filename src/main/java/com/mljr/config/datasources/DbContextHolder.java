package com.mljr.config.datasources;

/**
* @author kai.guo
* @version 创建时间：2018年11月7日 下午7:48:24
* @Description 类描述
*/
public class DbContextHolder {
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();
    /**
     * 设置数据源
     * @param dbTypeEnum
     */
    public static void setDbType(DBTypeEnum dbTypeEnum) {
        contextHolder.set(dbTypeEnum.getValue());
    }
    /**
     * 取得当前数据源
     * @return
     */
    public static String getDbType() {
        return (String) contextHolder.get();
    }
    /**
     * 清除上下文数据
     */
    public static void clearDbType() {
        contextHolder.remove();
    }
}
