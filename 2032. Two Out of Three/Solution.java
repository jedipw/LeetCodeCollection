class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> ans = new HashSet<>();

        for (int num1 : nums1) {
            set.add(num1);
        }

        for (int num2 : nums2) {
            if (set.contains(num2)) {
                ans.add(num2);
            }
        }

        for (int num2 : nums2) {
            set.add(num2);
        }

        for (int num3 : nums3) {
            if (set.contains(num3)) {
                ans.add(num3);
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int num : ans) {
            list.add(num);
        }

        return list;
    }
}