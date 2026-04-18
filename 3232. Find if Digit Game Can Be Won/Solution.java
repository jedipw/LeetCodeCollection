class Solution {
    public boolean canAliceWin(int[] nums) {
        int totalSingleDigits = 0;
        int totalDoubleDigits = 0;

        for (int num : nums) {
            if (num / 10 == 0) {
                totalSingleDigits += num;
            } else {
                totalDoubleDigits += num;
            }
        }

        return totalSingleDigits != totalDoubleDigits;
    }
}