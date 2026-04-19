// Last updated: 4/19/2026, 8:46:47 PM
class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        if (maxWeight / w > n * n) return n * n;
        else return maxWeight / w;
    }
}