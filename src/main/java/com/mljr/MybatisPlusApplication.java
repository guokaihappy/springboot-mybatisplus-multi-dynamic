package com.mljr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.mljr.ssm.mapper")  //配置mapper扫描
public class MybatisPlusApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(MybatisPlusApplication.class, args);
    }
}
