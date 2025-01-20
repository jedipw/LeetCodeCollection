class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        List<Boolean> result = new ArrayList<>();

        for (int i : candies) {
            max = Math.max(max, i);
        }

        for (int i : candies) {
            result.add(i + extraCandies >= max);
        }

        return result;
    }
}