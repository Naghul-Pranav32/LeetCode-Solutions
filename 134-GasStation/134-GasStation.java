// Last updated: 1/27/2026, 2:59:51 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int remaining_gas = 0, total_cost = 0, ans = 0;
        for (int i = 0; i < gas.length; i++) {
            total_cost += gas[i] - cost[i]; 
            remaining_gas += gas[i] - cost[i];
            if (remaining_gas < 0) {
                remaining_gas = 0;
                ans = i + 1;
            }
        }
        return total_cost >= 0 ? ans : -1;
    }
}