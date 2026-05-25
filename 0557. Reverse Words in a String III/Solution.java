class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] splits = s.split(" ");

        for (String word : splits) {
            sb.append(new StringBuilder(word).reverse().toString() + " ");
        }

        return sb.toString().trim();
    }
}