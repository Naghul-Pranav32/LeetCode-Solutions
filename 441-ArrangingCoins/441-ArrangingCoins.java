// Last updated: 1/27/2026, 2:59:06 PM
class Solution {
    public int arrangeCoins(int n) {
        int rows = 0;
        int i = 1;
        if (n == 1) return 1;
        while (n != 0) {   
            n -= i;
            if (n < 0) {
                return rows;
            }
            rows++;
            i++;
        }
        return rows;
    }
}