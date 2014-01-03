package com.example.spring;

public class BraveKnight implements Knight {

    private final Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }

}
