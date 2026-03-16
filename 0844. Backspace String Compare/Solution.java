class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    public String build(String s) {
        Stack<Character> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!stack.isEmpty())
                    stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        return String.valueOf(stack);
    }
}