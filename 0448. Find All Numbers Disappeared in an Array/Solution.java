class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int idx = Math.abs(nums[i]) - 1;

            if (nums[idx] > 0) {
                nums[idx] *= -1;
            }
        }

        for (int j = 0; j < n; j++) {
            if (nums[j] > 0) {
                res.add(j + 1);
            }
        }

        return res;
    }
}