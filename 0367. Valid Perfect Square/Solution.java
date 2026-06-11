class Solution {
    public boolean isPerfectSquare(int num) {
        long left = 0;
        long right = num;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long multiply = mid * mid;

            if (multiply == num) {
                return true;
            } else if (multiply > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }
}