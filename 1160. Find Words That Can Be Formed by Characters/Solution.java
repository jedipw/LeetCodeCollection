class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> charMap = new HashMap<>();
        int res = 0;

        for (char c : chars.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        for (String word : words) {
            Map<Character, Integer> wordMap = new HashMap<>();

            for (char c : word.toCharArray()) {
                wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);
            }

            boolean good = true;
            for (char c : word.toCharArray()) {
                if (wordMap.get(c) > charMap.getOrDefault(c, 0)) {
                    good = false;
                    break;
                }
            }

            if (good) {
                res += word.length();
            }
        }

        return res;
    }
}