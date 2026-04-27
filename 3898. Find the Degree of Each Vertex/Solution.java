class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i] += matrix[j][i];
            }
        }

        return res;
    }
}