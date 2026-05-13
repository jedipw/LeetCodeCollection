class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int res = 0;

        for (int batteryPercentage : batteryPercentages) {
            res += batteryPercentage > res ? 1 : 0;
        }

        return res;
    }
}