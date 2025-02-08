class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;

        for (int num : nums) {
            if (contains(nums, num + diff) && contains(nums, num + 2 * diff)) {
                count++;
            }
        }

        return count;
    }

    public boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }

        return false;
    }
}