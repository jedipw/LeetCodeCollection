class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Long> numsMap = new HashMap<>();
        int n = nums.length;
        long totalPairs = (long) (n - 1) * n / 2;

        for (int i = 0; i < n; i++) {
            int diff = nums[i] - i;
            totalPairs -= numsMap.getOrDefault(diff, 0L);
            numsMap.put(diff, numsMap.getOrDefault(diff, 0L) + 1);
        }

        return totalPairs;
    }
}