class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] sortedNum = nums.clone();
        int[] res = new int[n];
        Arrays.sort(sortedNum);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sortedNum[j] == nums[i]) {
                    res[i] = j;
                    break;
                }
            }
        }

        return res;
    }
}