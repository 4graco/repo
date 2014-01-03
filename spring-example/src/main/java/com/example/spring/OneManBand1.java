package com.example.spring;

import java.util.Map;
import java.util.Properties;

public class OneManBand1 implements Performer {

    protected Object nonNullObj = new Object();

    private Map<String, Instrument> instruments;

    private Properties sounds;

    public void perform() {
        for (String instrumentName : instruments.keySet()) {
            System.out.print(instrumentName + ":");
            Instrument instrument = instruments.get(instrumentName);
            instrument.play();
        }
        for (String sound : sounds.stringPropertyNames()) {
            System.out.println(sound + ":" + sounds.getProperty(sound));
        }
    }

    public Properties getSounds() {
        return sounds;
    }

    public void setSounds(Properties sounds) {
        this.sounds = sounds;
    }

    public Map<String, Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }

    public Object getNonNullObj() {
        return nonNullObj;
    }

    public void setNonNullObj(Object nonNullObj) {
        this.nonNullObj = nonNullObj;
    }

}
