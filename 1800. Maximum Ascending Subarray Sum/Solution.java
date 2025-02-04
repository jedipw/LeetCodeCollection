class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0], sum = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            int nextNum = nums[i + 1];
            if (nextNum > nums[i]) {
                sum += nextNum;
            } else {
                sum = nextNum;
            }

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}