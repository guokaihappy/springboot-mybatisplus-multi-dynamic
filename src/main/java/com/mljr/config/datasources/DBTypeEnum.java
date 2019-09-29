package com.mljr.config.datasources;

/**
* @author kai.guo
* @version 创建时间：2018年11月7日 下午7:47:30
 * 多数据源枚举
 */
public enum DBTypeEnum {
	db1("db1"), db2("db2");
    private String value;

    DBTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
