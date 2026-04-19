// Last updated: 4/19/2026, 8:47:06 PM
class Solution {
    public int maximumCount(int[] nums) {
        int ncount = 0, pcount = 0;
        for (int i : nums) {
            if (i > 0) pcount++;
            if (i < 0) ncount++;
        }
        return Math.max(ncount, pcount);
    }
}