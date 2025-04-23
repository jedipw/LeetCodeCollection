class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> arrList = new ArrayList();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            arrList.add(index[i], nums[i]);
        }

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = arrList.get(i);
        }

        return res;
    }
}