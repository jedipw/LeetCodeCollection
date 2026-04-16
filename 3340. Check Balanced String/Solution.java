class Solution {
    public boolean isBalanced(String num) {
        int totalEven = 0;
        int totalOdd = 0;

        for (int i = 0; i < num.length(); i++) {
            int n = num.charAt(i) - '0';

            if (i % 2 == 0) {
                totalEven += n;
            } else {
                totalOdd += n;
            }
        }

        return totalEven == totalOdd;
    }
}