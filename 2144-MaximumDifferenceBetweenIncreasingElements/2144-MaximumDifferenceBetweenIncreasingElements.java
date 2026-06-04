// Last updated: 6/4/2026, 10:42:37 AM
class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int difference = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) difference = Math.max(difference, nums[i] - min);
            else min = nums[i];
        }
        return difference;
    }
}