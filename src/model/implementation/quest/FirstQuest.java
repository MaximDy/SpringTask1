package model.implementation.quest;

import model.interfaces.quest.Quest;
import org.springframework.stereotype.Component;

@Component(value = "first_quest")
public class FirstQuest implements Quest {
    @Override
    public void embark() {
        System.out.println("First quest is done.");
    }
}
