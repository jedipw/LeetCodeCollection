class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq = new int[10];

        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }

        int res = -1;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= 9; i++) {
            if (freq[i] > 0) {
                if (min == freq[i]) {
                    res = Math.min(res, i);
                } else if (min > freq[i]) {
                    res = i;
                    min = freq[i];
                }
            }
        }

        return res;
    }
}