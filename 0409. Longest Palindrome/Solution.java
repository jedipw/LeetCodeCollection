class Solution {
    public int longestPalindrome(String s) {
        int oddCount = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);

            if (map.get(c) % 2 == 1) {
                oddCount++;
            } else {
                oddCount--;
            }
        }

        if (oddCount > 1)
            return s.length() - oddCount + 1;

        return s.length();
    }
}