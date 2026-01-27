// Last updated: 1/27/2026, 2:57:43 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) if (nums[i] % 3 != 0) count++;
        return count;
    }
}