class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int p1 = 0;
        int p2 = 0;
        int idx1 = 0;
        int idx2 = 0;

        while (p1 < word1.length && p2 < word2.length) {
            if (word1[p1].charAt(idx1) != word2[p2].charAt(idx2)) {
                return false;
            }

            idx1++;
            idx2++;

            if (idx1 == word1[p1].length()) {
                idx1 = 0;
                p1++;
            }

            if (idx2 == word2[p2].length()) {
                idx2 = 0;
                p2++;
            }
        }

        return p1 == word1.length && p2 == word2.length;
    }
}