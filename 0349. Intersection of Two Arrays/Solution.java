class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int num1 : nums1) {
            set.add(num1);
        }

        for (int num2 : nums2) {
            if (set.contains(num2)) {
                list.add(num2);
                set.remove(num2);
            }
        }

        int size = list.size();

        int[] res = new int[size];

        for (int i = 0; i < size; i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}