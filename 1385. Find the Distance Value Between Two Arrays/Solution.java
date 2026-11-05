class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n1 = arr1.length;
        int res = n1;

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    res--;
                    break;
                }
            }
        }

        return res;
    }
}