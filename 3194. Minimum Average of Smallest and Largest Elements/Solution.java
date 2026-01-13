class Solution {
    public double minimumAverage(int[] nums) {
        double minAvg = Double.MAX_VALUE;
        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n / 2; i++) {
            minAvg = Math.min(minAvg, (nums[i] + nums[n - 1 - i]) / 2.0);
        }

        return minAvg;
    }
}