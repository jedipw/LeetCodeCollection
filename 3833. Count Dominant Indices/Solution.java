class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        int res = 0;
        int total = 0;

        for (int i = n - 2; i >= 0; i--) {
            total += nums[i + 1];

            if (nums[i] > total / (n - i - 1)) {
                res++;
            }
        }

        return res;
    }
}