class Solution {
    public String reverseByType(String s) {
        Stack<Character> letters = new Stack<>();
        Stack<Character> specials = new Stack<>();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.push(c);
            } else {
                specials.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(letters.pop());
            } else {
                sb.append(specials.pop());
            }
        }

        return sb.toString();
    }
}