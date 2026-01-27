// Last updated: 1/27/2026, 2:58:48 PM
class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) if (nums[i] == nums[i + 1]) result = nums[i];
        return result;
    }
}