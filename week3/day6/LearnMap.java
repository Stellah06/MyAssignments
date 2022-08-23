package week3.day6;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        String text = "testleaf";

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(text.charAt(i))) {
                map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
            } else {
                map.put(text.charAt(i), 1);
            }
        }
        System.out.println(map);
    }
}