package lab9;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        String text = "To sorry world an at do spoil along. Incommode he depending do frankness remainder to. Edward day almost active him friend thirty piqued. People as period twenty my extent as. Set was better abroad ham plenty secure had horses. Admiration has sir decisively excellence say everything inhabiting acceptance. Sooner settle add put you sudden him.";
        String[] words = text.split("\\W+");

        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordFrequency);
    }
}
