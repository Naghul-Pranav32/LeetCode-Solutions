// Last updated: 4/19/2026, 8:46:43 PM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        List<Integer> l = new ArrayList<>();
        for (int i : friends) l.add(i);
        int [] result = new int[friends.length];
        int j = 0;
        for (int i : order) {
            if (l.contains(i)) {
                result[j] = i;
                j++;
            }
        }
        return result;
    }
}