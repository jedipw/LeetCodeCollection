class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;

        for (int num : nums) {
            if (countDigits(num) % 2 == 0)
                res++;
        }

        return res;
    }

    public int countDigits(int num) {
        int digit = 0;

        while (num > 0) {
            digit++;

            num /= 10;
        }

        return digit;
    }
}