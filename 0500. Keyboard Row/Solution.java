class Solution {
    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        for (String word : words) {
            if (isInRow(word, row1) || isInRow(word, row2) || isInRow(word, row3)) {
                res.add(word);
            }
        }

        return res.toArray(new String[0]);
    }

    private boolean isInRow(String s, String row) {
        for (char c : s.toCharArray()) {
            if (row.indexOf(Character.toLowerCase(c)) == -1) {
                return false;
            }
        }

        return true;
    }
}