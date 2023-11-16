package lab9;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        String text = "Certainty listening no no behaviour existence assurance situation is. Because add why not esteems amiable him. Interested the unaffected mrs law friendship add principles. Indeed on people do merits to. Court heard which up above hoped grave do. Answer living law things either sir bed length. Looked before we an on merely. These no death he at share alone. Yet outward the him compass hearted are tedious. ";
        String[] words = text.split("\\W+");

        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }

        System.out.println(uniqueWords);
    }
}