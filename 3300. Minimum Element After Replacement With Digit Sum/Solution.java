class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int[] sums = new int[n];

        for (int i = 0; i < n; i++) {
            int sum = 0;

            while (nums[i] > 0) {
                sum += nums[i] % 10;
                nums[i] /= 10;
            }

            sums[i] = sum;
        }

        int min = sums[0];

        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, sums[i]);
        }

        return min;
    }
}