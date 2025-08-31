class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet();

        for (int friend : friends) {
            set.add(friend);
        }

        int[] res = new int[set.size()];
        int index = 0;

        for (int number : order) {
            if (set.contains(number)) {
                res[index++] = number;
            }
        }

        return res;
    }
}