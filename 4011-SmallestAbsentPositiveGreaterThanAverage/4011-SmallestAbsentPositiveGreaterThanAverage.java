// Last updated: 4/19/2026, 8:46:42 PM
class Solution {
    public int smallestAbsent(int[] nums) {
        int average = 0;
        for (int i : nums) average += i;
        average /= nums.length;
        Set<Integer> hm = new HashSet<>();
        for (int i : nums) 
            if (i > 0) hm.add(i);
        int result = Math.max(1, average + 1);
        while(true) {
            if(!hm.contains(result)) return result;
            result++;
        }
    }
}