class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = 1;
        for (int[] account : accounts) {
            int temp = 0;
            for (int money : account) {
                temp += money;
            }
            if (result < temp) {
                result = temp;
            }
        }

        return result;
    }
}