class Solution {
    public String reversePrefix(String word, char ch) {
        int i = word.indexOf(ch);

        if (i == -1)
            return word;

        StringBuilder s = new StringBuilder();

        s.append(word.substring(0, i + 1)).reverse();
        s.append(word.substring(i + 1));

        return s.toString();
    }
}