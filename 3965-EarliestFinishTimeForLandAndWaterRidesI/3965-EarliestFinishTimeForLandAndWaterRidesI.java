// Last updated: 6/4/2026, 10:41:59 AM
class Solution {
    public int secondsCalc(int[] st1, int[] d1, int[] st2, int[] d2) {
        int mini = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < st1.length; i++) mini = Math.min(mini, st1[i] + d1[i]);
        for (int i = 0; i < st2.length; i++) ans = Math.min(Math.max(mini, st2[i]) + d2[i], ans);
        return ans;
    }
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int x = secondsCalc(landStartTime, landDuration, waterStartTime, waterDuration);
        int y = secondsCalc(waterStartTime, waterDuration, landStartTime, landDuration);
        return x < y ? x : y;
    }
}