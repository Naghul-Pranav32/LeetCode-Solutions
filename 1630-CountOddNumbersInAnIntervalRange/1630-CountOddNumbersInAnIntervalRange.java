// Last updated: 1/27/2026, 2:58:31 PM
class Solution {
    public int countOdds(int low, int high) {
        int range = (high - low + 1);
        if ((high % 2 == 1) && (low % 2 == 1)) return (range/2 + 1);
        else return range/2;
    }
}