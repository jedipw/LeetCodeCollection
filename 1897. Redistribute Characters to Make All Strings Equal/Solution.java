class Solution {
    public boolean makeEqual(String[] words) {
        if (words.length == 1) {
            return true;
        }

        int totalCharCount = 0;
        for (String s : words) {
            totalCharCount = s.length();
        }

        int[] arr = new int[26];
        for (String s : words) {
            for (char c : s.toCharArray()) {
                arr[c - 'a']++;
            }
        }

        for (int num : arr) {
            if (num % words.length != 0)
                return false;
        }

        return true;
    }
}