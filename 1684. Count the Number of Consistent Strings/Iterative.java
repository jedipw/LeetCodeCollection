class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for (String word : words) {
            char[] c = word.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (allowed.indexOf(c[i]) == -1) {
                    break;
                } else if (i == c.length - 1) {
                    count++;
                }
            }
        }

        return count;
    }
}