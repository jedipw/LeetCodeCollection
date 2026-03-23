class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            int totalWeight = 0;
            for (int i = 0; i < word.length(); i++) {
                totalWeight += weights[word.charAt(i) - 'a'];
            }
            sb.append((char) ('a' + (25 - (totalWeight % 26))));
        }
        return sb.toString();
    }
}