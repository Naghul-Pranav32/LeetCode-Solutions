// Last updated: 6/4/2026, 10:43:14 AM
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int[] r = new int[arr.length];
        Map<Integer, Integer> hm = new HashMap<>();
        int rank = 1;
        for (int i : sorted) {
            if(!hm.containsKey(i)) {
                hm.put(i, rank);
                rank++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            r[i] = hm.get(arr[i]);
        }
        return r;
    }
}