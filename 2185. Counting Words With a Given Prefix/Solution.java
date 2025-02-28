class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (isContainPref(words[i], pref)) count++;
        }

        return count;
    }

    public boolean isContainPref(String word, String pref) {
        if (word.length() < pref.length())
            return false;

        for (int i = 0; i < pref.length(); i++) {
            if (word.charAt(i) != pref.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}