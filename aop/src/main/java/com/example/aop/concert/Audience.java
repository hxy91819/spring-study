package com.example.aop.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author chenjing
 * @date 2020-01-30 18:09
 */
@Aspect
public class Audience {

    @Pointcut("execution(* Performance.perform(..))")
    public void performance() {

    }

    @Before("performance()")
    public void silenceCellPhone() {
        System.out.println(" silencing cell phones");
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp){
        try {
            System.out.println("1");
            jp.proceed();
            System.out.println("2");
        } catch (Exception e){
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
        }
    }
}
