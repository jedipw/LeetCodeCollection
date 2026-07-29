class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];

        for (int key : freqMap.keySet()) {
            int freq = freqMap.get(key);

            if (bucket[freq] == null) {
                bucket[freq] = new LinkedList<>();
            }

            bucket[freq].add(key);
        }

        List<Integer> res = new LinkedList<>();

        for (int i = bucket.length - 1; i > 0 && k > 0; i--) {
            if (bucket[i] != null) {
                List<Integer> values = bucket[i];
                res.addAll(values);
                k -= values.size();
            }
        }

        return res.stream().mapToInt(i -> i).toArray();
    }
}