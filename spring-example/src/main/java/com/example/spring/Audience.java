package com.example.spring;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {

    public void takeSeats() {
        System.out.println("The audience is taking their seats.");
    }

    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cell phones");
    }

    public void watchPerformance(ProceedingJoinPoint joinpoint) {
        try {
            long start = System.currentTimeMillis();
            joinpoint.proceed();
            long end = System.currentTimeMillis();
            System.out.println(end - start);
        } catch (Throwable t) {
            System.out.println("" + t.getMessage());
        }
    }

    public void applaud() {
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }

    public void demandRefund() {
        System.out.println("Boo! We want our money back!");
    }
}
