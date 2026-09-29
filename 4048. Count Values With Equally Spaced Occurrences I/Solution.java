class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[] counts = new int[100];
        int n = nums.length;

        for (int num : nums) {
            counts[num - 1]++;
        }

        int res = 0;

        for (int i = 0; i < n; i++) {
            int c = nums[i];
            if (counts[c - 1] != 3)
                continue;
            counts[c - 1] = -1;
            for (int distance = 1; i + (distance * 2) < n; distance++) {
                if (nums[i + distance] == c && nums[i + (distance * 2)] == c) {
                    res++;
                    break;
                }
            }
        }

        return res;
    }
}