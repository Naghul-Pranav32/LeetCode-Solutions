// Last updated: 4/19/2026, 8:46:30 PM
class Solution {
    public int firstUniqueEven(int[] nums) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);
        for(int i : map.keySet()) {
            if(i % 2 == 0 && map.get(i) == 1) return i;
        }
        return -1;
    }
}