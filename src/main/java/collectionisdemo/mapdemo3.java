package collectionisdemo;

import java.util.ArrayList;
import java.util.HashMap;

public class mapdemo3 {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cat", "dog", "elephant", "ant", "bat"};
        HashMap<Character, ArrayList<String>> groups = new HashMap<>();
        for (String word : words) {
            char firstLetter = word.charAt(0);
            if (!groups.containsKey(firstLetter)) {
                groups.put(firstLetter, new ArrayList<String>());
            }
            groups.get(firstLetter).add(word);
        }
        System.out.println(groups);
    }
}
