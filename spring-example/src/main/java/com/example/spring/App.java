package com.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String... args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("knight.xml");
        Knight knight = (Knight) ctx.getBean("knight");
        knight.embarkOnQuest();

        ApplicationContext ctx1 = new ClassPathXmlApplicationContext("spring-idol.xml");
        // Auditorium auditorium = (Auditorium) ctx1.getBean("auditorium");
        Stage stage = (Stage) ctx1.getBean("stage");
        stage.start();

        Performer performer = (Performer) ctx1.getBean("duke");
        performer.perform();
        performer = (Performer) ctx1.getBean("duke2");
        performer.perform();
        performer = (Performer) ctx1.getBean("poeticDuke");
        performer.perform();
        // performer = (Performer) ctx1.getBean("kenny");
        // performer.perform();
        performer = (Performer) ctx1.getBean("hank");
        performer.perform();
        performer = (Performer) ctx1.getBean("hank1");
        performer.perform();
        performer = (Performer) ctx1.getBean("carl");
        performer.perform();
        Contestant contestant = (Contestant) performer;
        contestant.receiveAward();
    }
}
