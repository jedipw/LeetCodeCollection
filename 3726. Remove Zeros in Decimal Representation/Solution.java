class Solution {
    public long removeZeros(long n) {
        String numString = Long.toString(n);
        StringBuilder sb = new StringBuilder();

        for (char c : numString.toCharArray()) {
            if (c != '0') {
                sb.append(c);
            }
        }

        return Long.parseLong(sb.toString());
    }
}