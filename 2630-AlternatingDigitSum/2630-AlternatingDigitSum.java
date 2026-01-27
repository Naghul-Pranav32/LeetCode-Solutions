// Last updated: 1/27/2026, 2:57:56 PM
class Solution {
    public int alternateDigitSum(int n) {
        String str_n = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < str_n.length(); i++) {
            int d = str_n.charAt(i) - '0';
            if (i % 2 == 0) sum += d;
            else sum -= d;
        }
        return sum;
    }
}