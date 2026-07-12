class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        int i = 0;
        for (int num : sorted) {
            if (i == 0 || sorted[i - 1] != num) {
                sorted[i++] = num;
            }
        }

        int[] unique = Arrays.copyOf(sorted, i);
        for (int j = 0; j < arr.length; j++) {
            arr[j] = find(arr[j], unique) + 1;
        }

        return arr;
    }

    public int find(int num, int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == num)
                return mid;
            else if (arr[mid] > num)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return -1;
    }
}