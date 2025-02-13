class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> p = new PriorityQueue<>();
        int count = 0;

        for (int num : nums) {
            p.add((long) num);
        }

        long x, y;

        while (p.peek() < k) {
            x = p.poll();
            if (!p.isEmpty()) {
                y = p.poll();
                p.add(x * 2 + y);
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}