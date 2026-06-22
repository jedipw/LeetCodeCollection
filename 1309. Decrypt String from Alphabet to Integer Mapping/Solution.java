class Solution {
    public String freqAlphabets(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                sb.insert(0, (char) (Integer.parseInt(s.substring(i - 2, i)) + 'a' - 1));
                i -= 2;
            } else {
                sb.insert(0, (char) ('a' + (s.charAt(i) - '0') - 1));
            }
        }

        return sb.toString();
    }
}