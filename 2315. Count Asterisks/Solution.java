class Solution {
    public int countAsterisks(String s) {
        boolean isPair = false;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                isPair = !isPair;
            } else if (!isPair && s.charAt(i) == '*') {
                count++;
            }
        }

        return count;
    }
}