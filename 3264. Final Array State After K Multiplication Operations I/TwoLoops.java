class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int[] arr = new int[2];

        for (int i = 0; i < k; i++) {
            arr = getMin(nums);
            nums[arr[1]] = arr[0] * multiplier;
        }

        return nums;
    }

    public int[] getMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
                idx = i;
            }
        }

        return new int[] { min, idx };
    }
}