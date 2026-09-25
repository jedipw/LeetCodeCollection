class Solution {
    public String maximumOddBinaryNumber(String s) {
        int totalOne = 0;
        int totalZero = 0;

        for (char c : s.toCharArray()) {
            if (c == '1')
                totalOne++;
            else
                totalZero++;
        }

        int n = s.length();

        StringBuilder sb = new StringBuilder();
        sb.append("1".repeat(totalOne - 1));
        sb.append("0".repeat(totalZero));
        sb.append("1");

        return sb.toString();
    }
}