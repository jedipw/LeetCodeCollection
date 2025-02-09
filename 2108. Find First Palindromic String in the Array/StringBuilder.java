class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word).reverse();
            if (word.equals(sb.toString())) {
                return word;
            }
        }

        return "";
    }
}