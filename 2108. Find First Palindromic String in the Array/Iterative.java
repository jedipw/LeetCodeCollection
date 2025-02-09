class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindromic(word))
                return word;
        }

        return "";
    }

    public boolean isPalindromic(String word) {
        int i = 0;
        int j = word.length() - 1;

        while (i < j) {
            if (word.charAt(i++) != word.charAt(j--))
                return false;
        }

        return true;
    }
}