class Solution {
    public int findClosest(int x, int y, int z) {
        int firstDistance = Math.abs(z - x);
        int secondDistance = Math.abs(z - y);

        if (firstDistance < secondDistance)
            return 1;
        else if (firstDistance > secondDistance)
            return 2;
        else
            return 0;
    }
}