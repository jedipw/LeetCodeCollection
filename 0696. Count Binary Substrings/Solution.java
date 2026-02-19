class Solution {
    public int countBinarySubstrings(String s) {
        int[] groups = new int[s.length()];
        groups[0] = 1;
        int t = 0;
        int ans = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                groups[++t] = 1;
            } else {
                groups[t]++;
            }
        }

        for (int j = 1; j <= t; j++) {
            ans += Math.min(groups[j - 1], groups[j]);
        }

        return ans;
    }
}