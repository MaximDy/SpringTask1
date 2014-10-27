package model.implementation.knight;

import model.interfaces.knight.Knight;
import model.interfaces.quest.Quest;

public class SomeKnight implements Knight{
    private Quest quest;

    public SomeKnight(Quest q) {
        this.quest = q;
    }

    @Override
    public void embarkOnQuest() {
        System.out.println("Some knight embarks on quest");
        quest.embark();
    }
}
