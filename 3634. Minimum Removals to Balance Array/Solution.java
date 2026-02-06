class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        int res = n;

        Arrays.sort(nums);

        int right = 0;
        for (int left = 0; left < n; left++) {
            while (right < n && nums[right] <= (long) nums[left] * k) {
                right++;
            }
            res = Math.min(res, n - (right - left));
        }

        return res;
    }
}