// Last updated: 1/27/2026, 2:59:18 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        return (n > 0) && ((n & (n - 1)) == 0) && ((n % 3) == 1);
    }
}