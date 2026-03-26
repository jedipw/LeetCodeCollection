class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        boolean[] memo = new boolean[101];

        for (int num : nums) {
            memo[num] = true;
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        for (int j = min; j <= max; j++) {
            if (memo[j] == false)
                list.add(j);
        }

        return list;
    }
}