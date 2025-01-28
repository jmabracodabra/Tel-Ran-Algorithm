package homework;

import java.util.HashMap;
import java.util.Map;

public class Homework3 {

    public static void main(String[] args) {
        String word = "AbraCadABRa";
        word = word.toLowerCase();

        Map<Character, Integer> lettersCount = new HashMap<>();

        for (Character s : word.toCharArray()) {
            if (Character.isLetter(s)) {
                lettersCount.put(s, lettersCount.getOrDefault(s, 0) + 1);
            }
        }
        System.out.println(lettersCount);
    }
}
