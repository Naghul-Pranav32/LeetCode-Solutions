// Last updated: 1/27/2026, 3:00:04 PM
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (maxsum < sum) maxsum = sum;
            if (sum < 0) sum = 0;
        }
        return maxsum;
    }
}