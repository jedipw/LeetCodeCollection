class Solution {
    public String interpret(String command) {
        int index = 0;
        StringBuilder s = new StringBuilder();

        while (index < command.length()) {
            if (command.charAt(index) == 'G') {
                s.append('G');
                index++;
            } else if (index + 1 < command.length()) {
                if (command.charAt(index + 1) == ')') {
                    s.append('o');
                    index += 2;
                } else {
                    s.append("al");
                    index += 4;
                }
            }
        }

        return s.toString();
    }
}