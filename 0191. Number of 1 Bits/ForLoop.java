class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String binaryString = Integer.toBinaryString(n);
        int output = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                output++;
            }
        }

        return output;
    }
}