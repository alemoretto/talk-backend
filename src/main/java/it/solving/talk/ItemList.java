package it.solving.talk;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@Component
public class ItemList {

    private List<String> wholeList;

    public ItemList() {

        wholeList = Arrays.asList("Like a Rolling Stone ",
                "(I Can't Get No) Satisfaction",
                "Imagine",
                "What's Going On",
                "Respect",
                "Good Vibrations",
                "Johnny B. Goode",
                "Hey Jude",
                "Smells Like Teen Spirit",
                "What'd I Say",
                "My Generation ",
                "A Change Is Gonna Come",
                "Yesterday",
                "Blowin' in the Wind",
                "London Calling",
                "I Want to Hold Your Hand",
                "Purple Haze",
                "Maybellene",
                "Hound Dog",
                "Let It Be");

    }

    public List<String> pickRandomList() {

        List<String> randomList = new ArrayList<>();
        while (randomList.size() < 10) {
            int rand = (int)(20 * Math.random());
            String randItem = wholeList.get(rand);
            if (!randomList.contains(randItem)) {
                randomList.add(randItem);
            }
        }

        return randomList;
    }

}
