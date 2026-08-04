class Solution {
    public int minimumChairs(String s) {
        int minChairs = 0;
        int people = 0;

        for (char c : s.toCharArray()) {
            if (c == 'E') {
                people++;
                minChairs = Math.max(minChairs, people);
            } else {
                people--;
            }
        }

        return minChairs;
    }
}