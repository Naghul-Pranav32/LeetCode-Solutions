// Last updated: 1/27/2026, 2:59:30 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0); 
    }
}