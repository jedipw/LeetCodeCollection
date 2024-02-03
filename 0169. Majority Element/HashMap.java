import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> occurence = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            occurence.put(nums[i], occurence.getOrDefault(nums[i], 0) + 1);
            if (occurence.getOrDefault(nums[i], 0) > nums.length / 2) {
                return nums[i];
            }
        }

        return -1;
    }
}