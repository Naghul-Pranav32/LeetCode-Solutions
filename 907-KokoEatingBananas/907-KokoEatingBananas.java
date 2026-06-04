// Last updated: 6/4/2026, 12:52:52 PM
class Solution {
    public int maxArr(int[] piles) {
        int ans = piles[0];
        for (int pile : piles) ans = Math.max(ans, pile);
        return ans;
    }
    public int speedCalc(int[] piles, int maxi, int h) {
        int left = 1;
        int right = maxi;
        while(left < right) {
            int mid = left + (right - left) / 2;
            int hours = 0;
            for (int i = 0; i < piles.length; i++) {
                hours += piles[i] / mid;
                if (piles[i] % mid != 0) {
                    hours++;
                }
            }
            if (hours > h) left = mid + 1;
            else right = mid;
        }
        return right;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxi = maxArr(piles);
        return speedCalc(piles, maxi, h);
    }
}