package com.kuang.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {

    public void afterReturning(Object o, Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("class::" + target.getClass().getName() + "   return value::" + o);
    }
}
