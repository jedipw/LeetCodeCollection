class Solution {
    public int maxDistance(int[] colors) {
        int left = 0, right = 0;
        int n = colors.length;

        for (int i = 0; i < n - 1; i++) {
            if (colors[n - 1] != colors[i]) {
                left = i;
                break;
            }
        }

        for (int i = n - 1; i > 0; i--) {
            if (colors[0] != colors[i]) {
                right = i;
                break;
            }
        }

        return Math.max(n - 1 - left, right);
    }
}