class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();

        for (String word : words) {
            int idx = 0;
            int n = word.length();

            for (int i = 0; i < n; i++) {
                if (word.charAt(i) == separator) {
                    if (idx < i) {
                        res.add(word.substring(idx, i));
                    }

                    idx = i + 1;
                }
            }

            if (idx < n) {
                res.add(word.substring(idx));
            }
        }

        return res;
    }
}