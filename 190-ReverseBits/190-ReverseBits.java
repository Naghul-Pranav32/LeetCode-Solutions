// Last updated: 1/27/2026, 2:59:40 PM
class Solution {
    public int reverseBits(int n) {
        int a = 0;
        for (int i = 0; i < 32; i++) {
            a <<= 1;
            a = (a | (n & 1));
            n >>= 1;
        }
        return a;
    }
}