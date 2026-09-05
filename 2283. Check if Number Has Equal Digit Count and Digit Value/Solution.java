class Solution {
    public boolean digitCount(String num) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : num.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < num.length(); i++) {
            char digitChar = (char) ('0' + i);

            if (num.charAt(i) - '0' != map.getOrDefault(digitChar, 0))
                return false;
        }

        return true;
    }
}