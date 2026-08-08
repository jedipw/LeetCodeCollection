class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int res = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] <= arr[i]) {
                arr[i + 1] = arr[i] + 1;
            }
        }

        for (int i = 0; i < n; i++) {
            res += arr[i] - nums[i];
        }

        return res;
    }
}