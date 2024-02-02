import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<Character, Integer>();

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int output = 0;
        int n = s.length() - 1;

        for (int i = n; i >= 0; i--) {
            int value = romanMap.get(s.charAt(i));
            if (i != n && value < romanMap.get(s.charAt(i + 1))) {
                output -= value;
            } else {
                output += value;
            }
        }
        return output;
    }
}