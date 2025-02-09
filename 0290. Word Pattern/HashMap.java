class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] splited = s.split(" ");

        if (splited.length != pattern.length()) {
            return false;
        }

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            String currentWord = splited[i];

            if (!charToWord.containsKey(currentChar)) {
                charToWord.put(currentChar, currentWord);
            }
            if (!wordToChar.containsKey(currentWord)) {
                wordToChar.put(currentWord, currentChar);
            }

            if (!charToWord.get(currentChar).equals(currentWord) || !wordToChar.get(currentWord).equals(currentChar)) {
                return false;
            }
        }

        return true;
    }
}