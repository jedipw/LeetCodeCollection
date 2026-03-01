class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;

        if (n == 1)
            return true;

        boolean isInc = true;
        boolean isDec = true;

        for (int i = 1; i < nums.length; i++) {
            if (!isInc && !isDec)
                return false;

            if (nums[i - 1] < nums[i]) {
                isDec = false;
            }

            if (nums[i - 1] > nums[i]) {
                isInc = false;
            }
        }

        return isInc || isDec;
    }
}