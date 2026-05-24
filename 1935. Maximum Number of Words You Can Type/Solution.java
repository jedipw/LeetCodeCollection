class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> set = new HashSet<>();
        String[] splits = text.split(" ");
        int count = 0;

        for (char c : brokenLetters.toCharArray()) {
            set.add(c);
        }

        for (String word : splits) {
            for (char c : word.toCharArray()) {
                if (set.contains(c)) {
                    count++;
                    break;
                }
            }
        }

        return splits.length - count;
    }
}