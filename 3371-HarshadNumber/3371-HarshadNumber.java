// Last updated: 1/27/2026, 2:57:47 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp = x;
        int sum = 0;
        while (x != 0) {
            int l = x % 10;
            sum += l;
            x /= 10;
        }
        return temp % sum == 0 ? sum : -1;
    }
}