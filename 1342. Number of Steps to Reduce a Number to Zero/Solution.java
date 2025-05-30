class Solution {
    public int numberOfSteps(int num) {
        int count = 0;

        while (num > 0) {
            if (num % 2 == 1) {
                num--;
                count++;
            } else {
                num /= 2;
                count++;
            }
        }

        return count;
    }
}