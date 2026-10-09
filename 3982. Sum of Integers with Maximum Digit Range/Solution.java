class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange = -1;
        int sum = 0;

        for (int num : nums) {
            int range = getDigitRange(num);

            if (range > maxRange) {
                maxRange = range;
                sum = num;
            } else if (range == maxRange) {
                sum += num;
            }
        }

        return sum;
    }

    public int getDigitRange(int num) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        while (num > 0) {
            int lastDigit = num % 10;

            largest = Math.max(largest, lastDigit);
            smallest = Math.min(smallest, lastDigit);

            num /= 10;
        }

        return largest - smallest;
    }
}