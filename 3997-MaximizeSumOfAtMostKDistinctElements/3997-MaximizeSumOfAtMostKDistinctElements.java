// Last updated: 4/19/2026, 8:46:44 PM
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> s = new TreeSet<>(Comparator.reverseOrder());
        for (int i : nums) s.add(i);
        int[] result = new int[Math.min(k, s.size())];
        int j = 0;
        for(int i : s) {
            if (k == 0) break;
            else {
                result[j] = i;
                j++;
                k--;
            }
        }
        return result;
    }
}