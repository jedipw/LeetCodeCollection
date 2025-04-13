class Solution {
    public int reverseDegree(String s) {
        int count = 0;
        int i = 1;

        for (char c : s.toCharArray()) {
            count += (123 - c) * i;
            i++;
        }

        return count;
    }
}