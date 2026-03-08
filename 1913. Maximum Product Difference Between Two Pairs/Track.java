class Solution {
    public int maxProductDifference(int[] nums) {
        int biggest = 0;
        int secondBiggest = 0;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int current : nums) {
            if (biggest < current) {
                secondBiggest = biggest;
                biggest = current;
            } else {
                secondBiggest = Math.max(secondBiggest, current);
            }

            if (smallest > current) {
                secondSmallest = smallest;
                smallest = current;
            } else {
                secondSmallest = Math.min(secondSmallest, current);
            }
        }

        return (biggest * secondBiggest) - (smallest * secondSmallest);
    }
}