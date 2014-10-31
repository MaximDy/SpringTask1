package model.implementation.quest;

import model.interfaces.quest.Quest;
import org.springframework.stereotype.Component;

@Component(value = "second_quest")
public class SecondQuest implements Quest{
    @Override
    public void embark() {
        System.out.println("Second quest is done.");
    }
}
