class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Boolean> map = new HashMap<>();

        for (String s : arr) {
            if (map.containsKey(s)) {
                map.put(s, false);
            } else {
                map.put(s, true);
            }
        }

        int count = 0;

        for (String s : arr) {
            if (map.get(s) == true) {
                count++;
            }

            if (count == k)
                return s;
        }

        return "";
    }
}