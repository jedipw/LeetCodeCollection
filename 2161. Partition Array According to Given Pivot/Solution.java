class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lessThan = new ArrayList<>();
        List<Integer> moreThan = new ArrayList<>();
        int countPivot = 0;

        for (int num : nums) {
            if (num < pivot) {
                lessThan.add(num);
            } else if (num > pivot) {
                moreThan.add(num);
            } else {
                countPivot++;
            }
        }

        lessThan.addAll(Collections.nCopies(countPivot, pivot));
        lessThan.addAll(moreThan);

        int i = 0;

        for (int n : lessThan) {
            nums[i++] = n;
        }

        return nums;
    }
}