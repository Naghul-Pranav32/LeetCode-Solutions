// Last updated: 1/27/2026, 2:58:05 PM
class Solution {
    public int commonFactors(int a, int b) {
        int min = a < b ? a : b;
        int c = 0;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) c++;
        }
        return c;
    }
}