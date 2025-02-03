class Solution {
    public int strStr(String haystack, String needle) {
        int nLength = needle.length();
        int hLength = haystack.length();

        for (int i = 0; i < hLength - nLength + 1; i++) {
            if (haystack.substring(i, i + nLength).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}