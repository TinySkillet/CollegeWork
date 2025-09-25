package com.example;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.example.ShoppingCart.checkOut())")
    public void beforeLogger(){
        System.out.println("Before Logger");
    }

    @After("execution(* *.*.*.checkOut())")
    public void afterLogger(){
        System.out.println("After Logger");
    }

}
