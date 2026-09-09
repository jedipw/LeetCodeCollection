class Solution {
    public boolean checkString(String s) {
        boolean isFirstBFound = false;

        for (char c : s.toCharArray()) {
            if (c == 'b') {
                isFirstBFound = true;
            }

            if (isFirstBFound && c == 'a') {
                return false;
            }
        }

        return true;
    }
}