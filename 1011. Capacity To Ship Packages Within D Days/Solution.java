class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;
        for (int w : weights) {
            left = Math.max(left, w);
            right += w;
        }

        int answer = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (possible(mid, weights, days)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }

    private boolean possible(int capacity, int[] weights, int days) {
        int daysUsed = 1;
        int load = 0;

        for (int w : weights) {
            if (load + w > capacity) {
                daysUsed++;
                load = 0;
            }
            load += w;
        }
        return daysUsed <= days;
    }
}