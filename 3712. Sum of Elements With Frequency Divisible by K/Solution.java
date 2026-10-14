class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i : map.keySet()) {
            int a = map.get(i);

            if (a % k == 0) {
                sum += a * i;
            }
        }

        return sum;
    }
}