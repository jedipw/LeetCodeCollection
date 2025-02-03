class Solution {
    public String truncateSentence(String s, int k) {
        String[] splitted = s.split(" ");
        StringBuilder st = new StringBuilder();

        for (int i = 0; i < k; i++) {
            st.append(splitted[i] + " ");
            if (i < k - 1)
                st.append(" ");
        }

        return st.toString();
    }
}