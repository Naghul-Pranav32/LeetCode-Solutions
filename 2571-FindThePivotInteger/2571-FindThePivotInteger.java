// Last updated: 1/27/2026, 2:58:01 PM
class Solution {
    public int pivotInteger(int n) {
        int total = n * (n + 1) / 2;
        int res = (int)Math.sqrt(total);
        if (res * res == total) return res;
        return -1;
    }
}