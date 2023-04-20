package collectionisdemo;

import java.util.HashMap;
// Counting the frequency of words in a string
public class mapdemo2 {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        String[] words = text.split(" ");
        HashMap<String, Integer> wordFreq = new HashMap<>();
        for (String word : words) {
            if (wordFreq.containsKey(word)) {
                wordFreq.put(word, wordFreq.get(word) + 1);
            } else {
                wordFreq.put(word, 1);
            }
        }
        System.out.println(wordFreq);
    }
}
