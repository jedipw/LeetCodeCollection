class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }

        for (int j = 0; j < t.length(); j++) {
            sum += Math.abs(map.get(t.charAt(j)) - j);
        }

        return sum;
    }
}