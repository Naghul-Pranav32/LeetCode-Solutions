// Last updated: 4/19/2026, 8:46:40 PM
class Solution {
    public int earliestTime(int[][] tasks) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < tasks.length; i++) {
            int sum = tasks[i][0] + tasks[i][1];
            result = Math.min(result, sum);
        }
        return result;
    }
}