package com.example.spring;

public class Instrumentalist implements Performer {

    private Instrument instrument;

    private String song;

    public void perform() {
        System.out.println("Playing " + song);
        instrument.play();
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

}
