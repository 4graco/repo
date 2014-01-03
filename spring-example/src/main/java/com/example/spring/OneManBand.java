package com.example.spring;

import java.util.Collection;

public class OneManBand implements Performer {

    private Collection<Instrument> instruments;

    public void perform() {
        System.out.println("Playing multiple instruments!");
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

    public Collection<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

}
