// Last updated: 4/19/2026, 8:46:34 PM
class Solution {
    public int firstUniqueFreq(int[] nums) {
        if (nums.length == 1) return nums[0];
        Map<Integer, Integer> lhm = new LinkedHashMap<>();
        for (int i : nums) lhm.put(i, lhm.getOrDefault(i, 0) + 1);
        Map<Integer, Integer> freq = new LinkedHashMap<>();
        for (int i : lhm.values()) freq.put(i, freq.getOrDefault(i, 0) + 1);
        for (int i : lhm.keySet()) if (freq.get(lhm.get(i)) == 1) return i;
        return -1;
    }
}