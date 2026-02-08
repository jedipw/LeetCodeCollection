class NumArray {
    private int[] prefixNums;

    public NumArray(int[] nums) {
        int n = nums.length;
        prefixNums = new int[n + 1];

        prefixNums[0] = 0;

        for (int i = 0; i < n; i++) {
            prefixNums[i + 1] = prefixNums[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefixNums[right + 1] - prefixNums[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */