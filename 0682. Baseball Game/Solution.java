class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack();
        int res = 0;

        for (String operation : operations) {
            if (operation.equals("+")) {
                int top = stack.pop();
                int newTop = stack.peek() + top;
                stack.push(top);
                stack.push(newTop);
            } else if (operation.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (operation.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(operation));
            }
        }

        for (int num : stack) {
            res += num;
        }

        return res;
    }
}