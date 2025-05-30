class Solution {
    public int numberOfMatches(int n) {
        int totalMatch = 0;

        while (n > 1) {
            totalMatch += n / 2;
            n = (n % 2) + (n / 2);
        }

        return totalMatch;
    }
}