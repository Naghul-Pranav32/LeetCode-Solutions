// Last updated: 1/27/2026, 2:58:17 PM
class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i) - 96;
            sum += digitSum(ch);
        }
        for (int i = 1; i < k; i++) sum = digitSum(sum);
        return sum;
    }
    private int digitSum(int num) {
        int result = 0;
        while (num != 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }
}