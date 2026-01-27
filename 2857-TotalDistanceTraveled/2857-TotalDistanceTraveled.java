// Last updated: 1/27/2026, 2:57:52 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        if (mainTank < 5) return mainTank * 10;
        int total = 0;
        while (mainTank >= 5) {
            total += 50;
            mainTank -= 5;
            if (additionalTank >= 1) {
                mainTank ++;
                additionalTank --;
            }
        }
        return total + mainTank * 10;
    }
}