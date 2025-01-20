class Solution {
    public String mergeAlternately(String word1, String word2) {
        int minLength = Math.min(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            sb.append(word1.charAt(i)).append(word2.charAt(i));
        }

        if (word1.length() > word2.length()) {
            sb.append(word1.substring(minLength));
        } else if (word2.length() > word1.length()) {
            sb.append(word2.substring(minLength));
        }

        return sb.toString();
    }
}