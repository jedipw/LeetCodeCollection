class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length, zero = 0, max = 0, left = 0;

        for (int right = 0; right < n; right++) {
            if (nums[right] == 0)
                zero++;

            while (zero > 1) {
                if (nums[left] == 0) {
                    zero--;
                }
                left++;
            }

            max = Math.max(max, right - left + 1 - zero);
        }

        if (n == max) {
            return max - 1;
        }

        return max;
    }
}