class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Integer[] res = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }

        Arrays.sort(res, (a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return Integer.compare(b, a);
            }
            return Integer.compare(map.get(a), map.get(b));
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = res[i];
        }

        return nums;
    }
}