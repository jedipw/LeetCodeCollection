class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum = 0;
        int squareSum = 0;

        while (n > 0) {
            digitSum += n % 10;
            squareSum += Math.pow(n % 10, 2);

            n /= 10;
        }

        return (squareSum - digitSum >= 50);
    }
}