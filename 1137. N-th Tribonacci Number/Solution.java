class Solution {
    public int tribonacci(int n) {
        if (n == 0)
            return 0;
        if (n <= 2)
            return 1;

        int first = 0, second = 1, third = 1;

        for (int i = 3; i <= n; i++) {
            int curr = first + second + third;
            first = second;
            second = third;
            third = curr;
        }

        return third;
    }
}