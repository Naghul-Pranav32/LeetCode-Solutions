// Last updated: 1/27/2026, 2:57:59 PM
class Solution {
    public int countDigits(int num) {
        int temp = num;
        int c = 0;
        while (num != 0) {
            int l = num % 10;
            if (temp % l == 0) c++;
            num /= 10;
        }
        return c;
    }
}