class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int arr[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                arr[i] = nums[left] * nums[left];
                left++;
            } else {
                arr[i] = nums[right] * nums[right];
                right--;
            }
        }

        return arr;
    }
}