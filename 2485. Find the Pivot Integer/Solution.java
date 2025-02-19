class Solution {
    public int pivotInteger(int n) {
        int totalSum = n * (n + 1) / 2;
        int leftSum = 0;

        for (int j = 1; j <= n; j++) {
            leftSum += j;
            int rightSum = totalSum - leftSum + j;

            if (leftSum == rightSum)
                return j;
        }

        return -1;
    }
}