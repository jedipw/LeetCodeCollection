class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (n / 2 != i && nums[n / 2] == nums[i])
                return false;
        }

        return true;
    }
}