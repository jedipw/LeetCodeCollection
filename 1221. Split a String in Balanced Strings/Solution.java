class Solution {
    public int balancedStringSplit(String s) {
        int res = 0;

        int balanceVal = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                balanceVal++;
            } else {
                balanceVal--;
            }

            if (balanceVal == 0)
                res++;
        }

        return res;
    }
}