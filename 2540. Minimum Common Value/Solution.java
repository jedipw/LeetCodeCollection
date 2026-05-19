class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int one = 0;
        int two = 0;

        int n1 = nums1.length;
        int n2 = nums2.length;

        while (one < n1 && two < n2) {
            int num1 = nums1[one];
            int num2 = nums2[two];

            if (num1 == num2) {
                return num1;
            } else if (num1 > num2) {
                two++;
            } else {
                one++;
            }
        }

        return -1;
    }
}