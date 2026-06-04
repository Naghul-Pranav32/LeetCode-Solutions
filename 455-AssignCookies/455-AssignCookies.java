// Last updated: 6/4/2026, 10:43:45 AM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        for (j = 0; i < g.length && j < s.length; j++)
            if (g[i] <= s[j]) i++;
        return i;
    }
}