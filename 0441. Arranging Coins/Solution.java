class Solution {
    public int arrangeCoins(int n) {
        long left = 1, right = n;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long row = mid * (mid + 1) / 2;
            if (row == n)
                return (int) mid;
            else if (row > n)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return (int) right;
    }
}