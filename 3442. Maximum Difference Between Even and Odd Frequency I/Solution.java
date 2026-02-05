class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int a1 = 1, a2 = s.length();

        for (int freq : map.values()) {
            if (freq % 2 == 0) {
                a2 = Math.min(a2, freq);
            } else {
                a1 = Math.max(a1, freq);
            }
        }

        return a1 - a2;
    }
}