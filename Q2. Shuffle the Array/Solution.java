class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[n * 2];

        for (int i = 0, resultIndex = 0; i < n; i++) {
            res[resultIndex++] = nums[i];
            res[resultIndex++] = nums[i + n];
        }

        return res;
    }
}