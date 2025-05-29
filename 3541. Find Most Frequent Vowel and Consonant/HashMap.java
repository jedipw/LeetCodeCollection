class Solution {
    public int maxFreqSum(String s) {
        int maxVowel = 0;
        int maxConsonant = 0;
        String vowel = "aeiou";
        String consonant = "bcdfghjklmnpqrstvwxyz";

        Map<Character, Integer> map = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < 5; i++) {
            maxVowel = Math.max(map.getOrDefault(vowel.charAt(i), 0), maxVowel);
        }

        for (int i = 0; i < 21; i++) {
            maxConsonant = Math.max(map.getOrDefault(consonant.charAt(i), 0), maxConsonant);
        }

        return maxVowel + maxConsonant;
    }
}