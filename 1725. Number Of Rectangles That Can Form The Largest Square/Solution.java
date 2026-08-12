class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int max = 0;
        int count = 0;

        for (int[] rectangle : rectangles) {
            int min = Math.min(rectangle[0], rectangle[1]);

            if (min > max) {
                max = min;
                count = 1;
            } else if (max == min) {
                count++;
            }
        }

        return count;
    }
}