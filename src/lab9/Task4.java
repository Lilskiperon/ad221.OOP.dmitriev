package lab9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        String text = "Breakfast agreeable incommode departure it an. By ignorant at on wondered relation. Enough at tastes really so cousin am of. Extensive therefore supported by extremity of contented. Is pursuit compact demesne invited elderly be. View him she roof tell her case has sigh. Moreover is possible he admitted sociable concerns. By in cold no less been sent hard hill.";
        String[] sentences = text.split("[.!?]");

        List<String> sentenceList = Arrays.asList(sentences);
        Collections.sort(sentenceList);

        System.out.println(sentenceList);
    }
}
