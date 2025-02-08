class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> balls = new HashMap<>();
        Map<Integer, Integer> colors = new HashMap<>();
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int newBall = queries[i][0];
            int newColor = queries[i][1];

            if (balls.containsKey(newBall)) {
                int oldColor = balls.get(newBall);
                colors.put(oldColor, colors.get(oldColor) - 1);

                if (colors.get(oldColor) == 0) {
                    colors.remove(oldColor);
                }
            }

            colors.put(newColor, colors.getOrDefault(newColor, 0) + 1);
            balls.put(newBall, newColor);
            result[i] = colors.size();
        }

        return result;
    }
}