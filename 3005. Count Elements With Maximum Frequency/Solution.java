class Solution {
    public int maxFrequencyElements(int[] nums) {
        byte[] freq = new byte[101];
        byte max = 0, res = 0;

        for (int num : nums) {
            byte f = ++freq[num];
            if (max < f) {
                max = f;
                res = f;
            } else if (f == max) {
                res += f;
            }
        }

        return res;
    }
}