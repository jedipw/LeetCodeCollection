class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int input = x;
        int sum = x % 10;

        while (x > 0) {
            x /= 10;
            sum += x % 10;
        }

        if (input % sum == 0)
            return sum;

        return -1;
    }
}