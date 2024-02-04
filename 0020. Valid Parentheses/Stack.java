class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!st.empty() && ((c == ')' && st.peek() == '(') || (c == ']' && st.peek() == '[')
                    || (c == '}' && st.peek() == '{'))) {
                st.pop();
            } else {
                st.push(c);
            }
        }

        return st.empty();
    }
}