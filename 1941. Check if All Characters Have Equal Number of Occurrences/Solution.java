class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr = new int[26];

        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }

        int prev = arr[s.charAt(0) - 'a'];

        for (int num : arr) {
            if (num != 0 && prev != num) {
                return false;
            }
        }

        return true;
    }
}