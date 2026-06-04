// Last updated: 6/4/2026, 10:43:42 AM
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0; 
        for (int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i + 1] <= timeSeries[i] + duration - 1) 
                total += timeSeries[i + 1] - timeSeries[i];
            else total += duration;
        }
        total += duration;
        return total;
    }
}