// Last updated: 1/27/2026, 2:59:23 PM
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int missing = 0;
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                missing = i;
                break;
            }
        }
        if(i == nums.length) return i;
        return missing;
    }
}