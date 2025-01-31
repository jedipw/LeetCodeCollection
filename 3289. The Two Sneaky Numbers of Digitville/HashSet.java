class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int[] ans = new int[2];
        int index = 0;

        for (int i : nums) {
            if (s.contains(i)) {
                ans[index++] = i;
            } else {
                s.add(i);
            }
        }

        return ans;
    }
}