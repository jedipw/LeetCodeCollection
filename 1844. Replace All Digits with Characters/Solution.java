class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 1; i < s.length(); i += 2) {
            int diff = s.charAt(i) - '0';
            int next = s.charAt(i - 1) + diff;
            sb.setCharAt(i, (char) next);
        }

        return sb.toString();
    }
}