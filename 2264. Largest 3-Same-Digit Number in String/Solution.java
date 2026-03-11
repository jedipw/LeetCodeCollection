class Solution {
    public String largestGoodInteger(String num) {
        String max = "";

        for (int i = 1; i < num.length() - 1; i++) {
            if (num.charAt(i - 1) == num.charAt(i) && num.charAt(i) == num.charAt(i + 1)) {
                max = max.compareTo(num.substring(i - 1, i + 2)) > 0 ? max : num.substring(i - 1, i + 2);
            }
        }

        return max;
    }
}