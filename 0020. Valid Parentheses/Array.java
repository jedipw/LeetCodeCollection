class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int head = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                    stack[head++] = ')';
                    break;
                case '[':
                    stack[head++] = ']';
                    break;
                case '{':
                    stack[head++] = '}';
                    break;
                default:
                    if (head == 0 || stack[--head] != c) {
                        return false;
                    }
                    break;
            }
        }

        return head == 0;
    }
}