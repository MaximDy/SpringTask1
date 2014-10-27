package model.implementation.quest;

import model.interfaces.quest.Quest;

public class FirstQuest implements Quest {
    @Override
    public void embark() {
        System.out.println("First quest is done.");
    }
}
