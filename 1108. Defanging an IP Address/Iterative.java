class Solution {
    public String defangIPaddr(String address) {
        StringBuilder ans = new StringBuilder();

        for (char s : address.toCharArray()) {
            if (s == '.') {
                ans.append("[.]");
            } else {
                ans.append(s);
            }
        }

        return ans.toString();
    }
}