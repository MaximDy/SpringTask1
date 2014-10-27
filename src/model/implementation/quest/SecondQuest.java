package model.implementation.quest;

import model.interfaces.quest.Quest;

public class SecondQuest implements Quest{
    @Override
    public void embark() {
        System.out.println("Second quest is done.");
    }
}
