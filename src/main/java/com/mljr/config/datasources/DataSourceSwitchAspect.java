package com.mljr.config.datasources;

/**
* @author kai.guo
* @version 创建时间：2018年11月7日 下午8:48:42
* @Description 类描述
*/
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 配置 数据源 映射的 mapper包
 * @author kai.guo
 */
@Component
@Order(value = -100)
@Slf4j
@Aspect
public class DataSourceSwitchAspect {

//	在student包或其子包中定义的任意方法的执行：
    @Pointcut("execution(* com.mljr.ssm.mapper.student..*.*(..))")
    private void db1Aspect() {
    }

//	在teacher包或其子包中定义的任意方法的执行：
    @Pointcut("execution(* com.mljr.ssm.mapper.teacher..*.*(..))")
    private void db2Aspect() {
    }

    @Before("db1Aspect()")
    public void db1() {
        log.info("切换到db1 数据源...");
        DbContextHolder.setDbType(DBTypeEnum.db1);
    }

    @Before("db2Aspect()")
    public void db2() {
        log.info("切换到db2 数据源...");
        DbContextHolder.setDbType(DBTypeEnum.db2);
    }

}
