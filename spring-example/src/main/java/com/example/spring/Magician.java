package com.example.spring;

public class Magician implements MindReader {

    private String thoughts;

    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting thoughts");
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }

}
