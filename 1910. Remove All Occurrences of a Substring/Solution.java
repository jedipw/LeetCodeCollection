class Solution {
    public String removeOccurrences(String s, String part) {
        char[] stack = new char[s.length()];
        int idx = 0;
        int partLength = part.length();

        for (int i = 0; i < s.length(); i++) {
            stack[idx++] = s.charAt(i);

            if (idx >= partLength) {
                boolean match = true;
                for (int j = 1; j <= partLength; j++) {
                    if (stack[idx - j] != part.charAt(partLength - j)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    idx -= partLength;
                }
            }
        }

        return new String(stack, 0, idx);
    }
}