class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] results = new int[n * 2];
        int i = 0;

        for (int j = 0; j < n; j++) {
            results[i++] = nums[j];
            results[i++] = nums[n + j];
        }

        return results;
    }
}