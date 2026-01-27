// Last updated: 1/27/2026, 2:59:10 PM
class Solution {
    public char findTheDifference(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return b[i];
        }
        return b[b.length - 1];
    }
}