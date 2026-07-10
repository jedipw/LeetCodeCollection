class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        int k = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                sb.append(s.substring(k + 1, i));
                k = i + 1;
                count = 0;
            }
        }

        return sb.toString();
    }
}