class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        for (int num : nums) {
            maxi = Math.max(maxi, num);
            mini = Math.min(mini, num);
        }

        int res = Math.abs(maxi - mini) - 2 * k;

        if (res < 0) res = 0;

        return res;
    }
}