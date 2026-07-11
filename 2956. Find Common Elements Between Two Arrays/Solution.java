class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        boolean[] arr1 = new boolean[101];
        boolean[] arr2 = new boolean[101];

        for (int num : nums1) {
            arr1[num] = true;
        }

        for (int num : nums2) {
            arr2[num] = true;
        }

        int one = 0;
        int two = 0;

        for (int num : nums1) {
            if (arr2[num])
                one++;
        }

        for (int num : nums2) {
            if (arr1[num])
                two++;
        }

        return new int[] { one, two };
    }
}