class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long> res = new ArrayList<>();
        int n = 0;

        for (int i = 0; i < nums.length; i++) {
            long currentNum = nums[i];

            while (n > 0 && res.get(n - 1).equals(currentNum)) {
                res.remove(--n);
                currentNum *= 2;
            }

            res.add(currentNum);
            n++;
        }

        return res;
    }
}