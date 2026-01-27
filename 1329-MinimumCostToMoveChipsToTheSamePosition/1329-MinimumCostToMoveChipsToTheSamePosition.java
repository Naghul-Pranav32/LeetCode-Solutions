// Last updated: 1/27/2026, 2:58:42 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int oc = 0, ec = 0;
        for (int x : position) {
            if (x % 2 == 0) ec++;
            else oc++;
        }
        return oc > ec ? ec : oc;
    }
}