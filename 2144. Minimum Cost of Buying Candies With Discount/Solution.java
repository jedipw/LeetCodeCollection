class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int n = cost.length;
        int res = 0;

        for (int i = n - 1; i >= 0; i--) {
            if ((n - 1 - i) % 3 != 2)
                res += cost[i];
        }

        return res;
    }
}