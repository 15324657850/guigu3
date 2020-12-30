package com.example.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author wxl
 */
@Component
@Aspect
public class AopTest {
    @Pointcut(value = "execution(public int com.example.spring.CalServiceImpl.*(..))")
    public void point() {
    }


    @Before(value = "point()")
    public void before() {
        System.out.println("@before我是前置通知");
    }

    @After(value = "point()")
    public void after() {
        System.out.println("@After我是后置通知");

    }

    @AfterReturning(value = "point()")
    public void afterReturning() {
        System.out.println("@AfterReturning我是后置返回后通知");

    }

    @AfterThrowing(value = "point()")
    public void afterThrowing() {
        System.out.println("@AfterThrowing我是异常通知");

    }

    @Around(value = "point()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object value = null;
        System.out.println("@Around我是环绕通知之前AAA");
        value = proceedingJoinPoint.proceed();
        System.out.println("@Around我是环绕通知之后BBB");
        return value;
    }
}
