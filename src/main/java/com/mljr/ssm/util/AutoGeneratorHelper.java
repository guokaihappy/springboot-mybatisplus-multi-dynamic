package com.mljr.ssm.util;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.builder.ConfigBuilder;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 自动生成映射工具类
 * Created by Hong on 2016/12/13.
 */
public class AutoGeneratorHelper {

	/**
	 * 执行
	 */
	public static void main( String[] args ) {
		AutoGenerator autoGenerator = new AutoGenerator();

		
		/**
		 *  数据源配置
		 */
		DataSourceConfig bc = new DataSourceConfig();
		bc.setDbType(DbType.MYSQL);
		bc.setDriverName("com.mysql.jdbc.Driver");
		bc.setUsername("root");
		bc.setPassword("root");
		bc.setUrl("jdbc:mysql://localhost:3306/tb_security?useUnicode=true&characterEncoding=utf8");
		
		/**
		 * 数据库表配置
		 */
		StrategyConfig sc = new StrategyConfig();
		sc.setNaming(NamingStrategy.underline_to_camel);// 数据库表映射到实体的命名策略
//		sc.setInclude(new String[] { "user" }); // 需要生成的表
//		sc.setSuperEntityClass("com.hong610.domain.base.BaseEntity");//自定义继承的Entity类全称，带包名。Base Entity
//		sc.setExclude(new String[]{"id", "modified_time", "status", "is_delete"});//排除
//		sc.setSuperControllerClass("com.hong610.controller.base.BaseController");//自定义继承的Controller类全称，带包名。Base COntroller
		
		/**
		 * 包名配置
		 */
		PackageConfig pc = new PackageConfig();
		pc.setParent("com.mljr");	//父包名。如果为空，将下面子包名必须写全部， 否则就只需写子包名
		pc.setModuleName(null);
		pc.setMapper("security.mapper");
		pc.setXml("mapper.xml");
		pc.setEntity("security.entity");
		pc.setService("security.service");
		pc.setServiceImpl("security.service.impl");
//		pc.setController("controller");

		/**
		 * 模板配置
		 */
		TemplateConfig tc = new TemplateConfig();
		tc.setEntity("/velocity/entity.java.vm");	//Java 实体类模板
		tc.setXml("/velocity/mapper.xml.vm");
		tc.setMapper("/velocity/mapper.java.vm");
		tc.setService("/velocity/service.java.vm");
		tc.setServiceImpl("/velocity/serviceImpl.java.vm");
//		tc.setController("/velocity/controller.java.vm");

		/**
		 * 全局策略 globalConfig 配置
		 */
		GlobalConfig gc = new GlobalConfig();
		gc.setFileOverride(true);				//是否覆盖已有文件
		gc.setActiveRecord(true);
		gc.setEnableCache(false);				// XML 二级缓存
		gc.setBaseResultMap(true);				// XML ResultMap
		gc.setBaseColumnList(true);				// XML columList
		gc.setAuthor("kai.guo");				//开发人员
		gc.setIdType(IdType.AUTO);				//主键策略
//		gc.setEntityName("%sEntity");
		gc.setServiceName("I%sService");//自定义文件命名，注意 %s 会自动填充表实体属性！
		gc.setServiceImplName("%sServiceImpl");
		gc.setOutputDir("D:\\java");		//生成文件的输出目录

		// 注入自定义配置，可以在 VM 中使用 cfg.xxx 设置的值
		InjectionConfig cfg = new InjectionConfig() {
			@Override
			public void initMap() {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("time", new SimpleDateFormat("yyyy/MM/dd").format(new Date()));
				this.setMap(map);
			}
		};
		autoGenerator.setCfg(cfg);


		ConfigBuilder config = new ConfigBuilder(pc, bc, sc, tc, gc);
		autoGenerator.setConfig(config);
		autoGenerator.execute();
	}

}
