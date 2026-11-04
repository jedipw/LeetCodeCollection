class Solution {
    public int backtrack(int[] nums, int index, int xorValue) {
        if (index == nums.length) {
            return xorValue;
        }

        int notIncludeSum = backtrack(nums, index + 1, xorValue);

        int includeSum = backtrack(nums, index + 1,
                xorValue ^ nums[index]);

        return notIncludeSum + includeSum;
    }

    public int subsetXORSum(int[] nums) {
        return backtrack(nums, 0, 0);
    }
}