class Solution {
    public String trimTrailingVowels(String s) {
        int i;

        for (i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o'
                    && s.charAt(i) != 'u') {
                break;
            }
        }

        return s.substring(0, i + 1);
    }
}