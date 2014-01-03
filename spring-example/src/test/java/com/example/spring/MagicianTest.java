package com.example.spring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MagicianTest {

    @Test
    public void magicianShouldReadValunteersMind() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
        Thinker valunteer = (Thinker) ctx.getBean("valunteer");
        Magician magician = (Magician) ctx.getBean("magician");
        valunteer.thinkOfSomething("Queen of Hearts");
        String magicianThoughts = magician.getThoughts();
        System.out.println(magician.getThoughts());
        assertEquals(magicianThoughts, valunteer.getThoughts());
    }

}
