class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int max = 0;
        int min = 0;

        for (int i = 0, j = nums.length - 1; i < k; i++, j--) {
            max += nums[j];
            min += nums[i];
        }

        return max - min;
    }
}