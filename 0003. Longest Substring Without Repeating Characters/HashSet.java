class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int stringLength = s.length();
        int maxLength = 0;

        Set<Character> charSets = new HashSet<>();

        for (int right = 0; right < stringLength; right++) {
            char rightChar = s.charAt(right);
            if (!charSets.contains(rightChar)) {
                charSets.add(rightChar);
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSets.contains(rightChar)) {
                    charSets.remove(s.charAt(left));
                    left++;
                }
                charSets.add(rightChar);
            }
        }

        return maxLength;
    }
}