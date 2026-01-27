// Last updated: 1/27/2026, 2:58:29 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map <Integer, Integer> freq = new HashMap<>();
        int res = 0;
        for (int x : nums) {
            res += freq.getOrDefault(x, 0);
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        return res;
    }
}