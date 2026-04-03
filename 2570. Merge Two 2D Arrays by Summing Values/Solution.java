class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int left = 0;
        int right = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        List<int[]> list = new ArrayList();

        while (left < n1 && right < n2) {
            if (nums1[left][0] == nums2[right][0]) {
                list.add(new int[] { nums1[left][0], nums1[left][1] + nums2[right][1] });
                left++;
                right++;
            } else if (nums1[left][0] < nums2[right][0]) {
                list.add(nums1[left]);
                left++;
            } else {
                list.add(nums2[right]);
                right++;
            }
        }

        while (left < n1) {
            list.add(nums1[left]);
            left++;
        }

        while (right < n2) {
            list.add(nums2[right]);
            right++;
        }

        int[][] res = new int[list.size()][2];

        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}