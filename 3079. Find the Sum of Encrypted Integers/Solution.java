class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int total = 0;

        for (int num : nums) {
            int maxDigit = 0;
            int repeat = 0;

            while (num > 0) {
                maxDigit = Math.max(maxDigit, num % 10);
                repeat++;
                num /= 10;
            }

            int encryptedVal = 0;

            for (int i = 0; i < repeat; i++) {
                encryptedVal = encryptedVal * 10 + maxDigit;
            }

            total += encryptedVal;
        }

        return total;
    }
}