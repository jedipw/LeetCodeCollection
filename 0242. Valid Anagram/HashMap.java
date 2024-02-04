import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> charMap = new HashMap<>();

        for(char x : s.toCharArray()) {
            charMap.put(x, charMap.getOrDefault(x, 0) + 1);
        }

        for(char x : t.toCharArray()) {
            charMap.put(x, charMap.getOrDefault(x, 0) - 1);
        }

        for(int val : charMap.values()) {
            if(val != 0) {
                return false;
            }
        }
        return true;
    }
}