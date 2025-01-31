class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0, temp[] = new int[101];

        for (int i : nums) {
            ans += temp[i]++;
        }

        return ans;
    }
}