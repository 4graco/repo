package com.example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringIdolConfig {

    @Bean
    public Instrument guitar() {
        Instrument guitar = new Guitar();
        return guitar;
    }

    @Bean
    public Performer kenny() {
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("Jingle Bells");
        kenny.setInstrument(guitar());
        return kenny;
    }

    @Bean
    public Performer duke15() {
        return new Juggler(15);
    }
}
