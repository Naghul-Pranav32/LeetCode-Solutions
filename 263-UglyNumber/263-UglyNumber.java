// Last updated: 1/27/2026, 2:59:26 PM
class Solution {
    public boolean isUgly(int n) {
        int[] factors = {2, 3, 5};
        if (n == 0) return false;
        for (int i = 0; i < factors.length; i++) {
            while (n % factors[i] == 0) {
                n /= factors[i];
            }
        }
        return n == 1;
    }
}