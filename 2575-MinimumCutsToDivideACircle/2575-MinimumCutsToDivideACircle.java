// Last updated: 1/27/2026, 2:58:00 PM
class Solution {
    public int numberOfCuts(int n) {
        return n ==1 ? 0 : n % 2 == 0 ? n/2 : n;        
    }
}