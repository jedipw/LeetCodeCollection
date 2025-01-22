class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        answer.add(new ArrayList<>());

        for (int i : nums1) {
            set1.add(i);
        }

        for (int i : nums2) {
            set2.add(i);
        }

        for (int i : set1) {
            if (!set2.contains(i)) {
                answer.get(0).add(i);
            }
        }

        for (int i : set2) {
            if (!set1.contains(i)) {
                answer.get(1).add(i);
            }
        }

        return answer;
    }
}