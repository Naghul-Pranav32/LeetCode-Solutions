// Last updated: 1/27/2026, 2:57:55 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int result = arrivalTime + delayedTime;
        return result >= 24 ? result - 24 : result;
    }
}