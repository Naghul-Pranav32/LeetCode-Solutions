// Last updated: 4/19/2026, 8:46:55 PM
class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int sum = 0;
        for(int i = 0; i < nums1.length; i++) {
            sum += nums2[i] - nums1[i];
        }
        return (int) sum/nums1.length;
    }
}