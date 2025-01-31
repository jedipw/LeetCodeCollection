class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;

        for (String s : operations) {
            X += 44 - s.charAt(1);
        }

        return X;
    }
}