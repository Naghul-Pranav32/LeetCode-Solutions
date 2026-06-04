// Last updated: 6/4/2026, 10:43:38 AM
class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : score) pq.add(i);
        int r = 1;
        Map<Integer, String> hm = new HashMap<>();
        while(r <= score.length) {
            if (r == 1) hm.put(pq.remove(), "Gold Medal");
            else if (r == 2) hm.put(pq.remove(), "Silver Medal");
            else if (r == 3) hm.put(pq.remove(), "Bronze Medal");
            else hm.put(pq.remove(), String.valueOf(r));
            r++;
        }
        for (int i = 0; i < score.length; i++) ans[i] = hm.get(score[i]);
        return ans;
    }
}