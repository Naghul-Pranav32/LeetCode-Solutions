// Last updated: 6/4/2026, 10:43:16 AM
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }
        int total = 0;
        int clock = 0, anticlock = 0;
        for (int i : distance) total += i;
        for (int i = start; i < destination; i++) clock += distance[i];
        anticlock = total - clock;
        return Math.min(clock, anticlock);
    }
}