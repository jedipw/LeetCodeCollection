class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        int[] count = new int[size + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[grid[i][j]]++;
            }
        }

        int repeatingNum = -1, missingNum = -1;

        for (int i = 1; i <= size; i++) {
            if (count[i] == 2) {
                repeatingNum = i;
            } else if (count[i] == 0) {
                missingNum = i;
            }
        }

        return new int[] { repeatingNum, missingNum };
    }
}