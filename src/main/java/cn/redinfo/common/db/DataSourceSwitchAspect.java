/**
 * @auther: liyl
 * @date: 2019年12月5日 上午10:44:37
 * @Description: TODO
 */
package cn.redinfo.common.db;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @auther: L
 * @date: 2019年12月5日 上午10:44:37
 * @Description: TODO
 */
@Component
@Order(value = -100)
@Slf4j
@Aspect
public class DataSourceSwitchAspect {
    // 涟水
    //@Pointcut("execution(* cn.redinfo.biz.ba.dao..*.*(..))")
    @Pointcut("execution(* cn.redinfo.biz.ba.service..*.*(..))")
    private void db1Aspect() {
    }

    // 高邮
    //@Pointcut("execution(* cn.redinfo.biz.elder.dao..*.*(..))")
    @Pointcut("execution(* cn.redinfo.biz.elder.service..*.*(..))")
    private void db2Aspect() {
    }


    @Before("db1Aspect()")
    public void db1() {
        DbContextHolder.setDbType(DBTypeEnum.db1);
        log.info("切换到涟水 数据源...");
    }

    @Before("db2Aspect()")
    public void db2() {
        DbContextHolder.setDbType(DBTypeEnum.db2);
        log.info("切换到高邮 数据源...");
    }

}
