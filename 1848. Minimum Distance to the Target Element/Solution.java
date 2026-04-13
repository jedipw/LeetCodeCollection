class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = Integer.MAX_VALUE;

        for (int i = start; i < nums.length; i++) {
            if (nums[i] == target) {
                min = i - start;
                break;
            }
        }

        for (int i = start - 1; i >= 0; i--) {
            if (nums[i] == target) {
                min = Math.min(min, start - i);
                break;
            }
        }

        return min;
    }
}