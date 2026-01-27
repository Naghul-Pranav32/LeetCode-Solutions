// Last updated: 1/27/2026, 2:58:23 PM
class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int money = 1;
        int week = 0;
        for (int i = 1; i <= n; i++) {
            if (i%7 == 1) {
                week++;
                money = week;
            }
            total += money;
            money++;
        }
        return total;
    }
}