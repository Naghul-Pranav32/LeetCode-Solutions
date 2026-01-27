// Last updated: 1/27/2026, 2:59:42 PM
class Solution {
    public int trailingZeroes(int n) {
        if (n <= 4) return 0;
        int count = 0;
        while ( n >= 5) {
            count += n/5;
            n /= 5;
        }
        return count;
    }
}