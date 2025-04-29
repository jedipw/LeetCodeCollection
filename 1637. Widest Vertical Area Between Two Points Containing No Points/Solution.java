class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int res = 0;

        for (int j = 0; j < points.length - 1; j++) {
            res = Math.max(res, points[j + 1][0] - points[j][0]);
        }

        return res;
    }
}