// Last updated: 1/27/2026, 2:57:32 PM
class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> hs = new HashSet<>();
        for (int i : nums) hs.add(i);
        int j = k;
        while(hs.contains(j)) j+=k;
        return j;
    }
}