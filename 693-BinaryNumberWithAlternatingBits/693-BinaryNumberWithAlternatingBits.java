// Last updated: 1/27/2026, 2:58:57 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int x = (n ^ (n >> 1));
        return (x & (x + 1)) == 0;
    }
}