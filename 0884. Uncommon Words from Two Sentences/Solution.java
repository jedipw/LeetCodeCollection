class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String s = s1 + " " + s2;
        String[] words = s.split(" ");

        Map<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                res.add(entry.getKey());
            }
        }

        return res.toArray(new String[0]);
    }
}