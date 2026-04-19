// Last updated: 4/19/2026, 8:46:58 PM
class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int i : nums) {
            sum += i;
            if (sum == 0) count++;
        }
        return count;
    }
}