package com.example.spring;

public class Stage {

    private Stage() {
    }

    private static class StageHolder {
        private static Stage instance = new Stage();
    }

    public static Stage getInstance() {
        return StageHolder.instance;
    }

    public void start() {
        System.out.println("Starting stage!");
    }

}
