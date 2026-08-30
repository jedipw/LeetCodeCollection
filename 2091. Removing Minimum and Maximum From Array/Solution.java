class Solution {
    public int minimumDeletions(int[] nums) {
        int minIndex = 0;
        int maxIndex = 0;
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[minIndex] > nums[i]) {
                minIndex = i;
            }

            if (nums[maxIndex] < nums[i]) {
                maxIndex = i;
            }
        }

        int l = Math.min(minIndex, maxIndex);
        int r = Math.max(minIndex, maxIndex);
        ;

        return Math.min(Math.min(r + 1, n - l), l + 1 + n - r);
    }
}