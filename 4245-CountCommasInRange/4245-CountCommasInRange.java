// Last updated: 4/19/2026, 8:46:35 PM
class Solution {
    public int countCommas(int n) {
        if (n < 1000) return 0;
        return n - 1000 + 1;
    }
}