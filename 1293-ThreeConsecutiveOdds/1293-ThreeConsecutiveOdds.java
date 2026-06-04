// Last updated: 6/4/2026, 10:43:12 AM
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 != 0) count++;
            else count = 0;
            if (count == 3) return true;
        }
        return false;
    }
}