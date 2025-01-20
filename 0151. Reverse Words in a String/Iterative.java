class Solution {
    public String reverseWords(String s) {
        String[] splited = s.trim().split("\\s+");

        String result = splited[splited.length - 1];

        for (int i = splited.length - 2; i >= 0; i--) {
            result = result.concat(" " + splited[i]);
        }

        return result;
    }
}