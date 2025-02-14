class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[k - 1] != nums[i]) {
                count = 0;
                nums[k++] = nums[i];
            } else {
                count++;
                if (count <= 1) {
                    nums[k++] = nums[i];
                }
            }
        }

        return k;
    }
}