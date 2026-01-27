// Last updated: 1/27/2026, 2:59:01 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 1;
        if (num == 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum == num;
    }
}