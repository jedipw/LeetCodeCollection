class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];

        for (int i = 0; i < n; i++) {
            int currentNum = nums[i];
            ans[i] = currentNum;
            ans[i + n] = currentNum;
        }

        return ans;
    }
}