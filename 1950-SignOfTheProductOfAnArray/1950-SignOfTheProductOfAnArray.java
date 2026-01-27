// Last updated: 1/27/2026, 2:58:20 PM
class Solution {
    public int arraySign(int[] nums) {
        int product = 1;
        int count = 0;
        for (int i : nums) {
            if (i == 0) return 0;
            if (i < 0) count++;
        }
        return count % 2 == 0 ? 1 : -1;
    }
}