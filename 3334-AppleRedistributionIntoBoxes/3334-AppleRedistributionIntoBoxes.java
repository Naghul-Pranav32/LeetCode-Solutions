// Last updated: 1/27/2026, 2:57:48 PM
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int as = 0;
        int total = 0;
        for (int i : apple) as += i;
        for (int i = capacity.length - 1; i >= 0; i--) {
            as = as - capacity[i];
            total++;
            if (as <= 0) return total;
        }
        return total;
    }
}