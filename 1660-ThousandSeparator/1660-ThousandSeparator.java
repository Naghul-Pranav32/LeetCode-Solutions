// Last updated: 6/4/2026, 10:42:53 AM
class Solution {
    public String thousandSeparator(int n) {
        String ns = String.valueOf(n);
        StringBuilder nb = new StringBuilder();
        int count = 0;
        for(int i = ns.length() - 1; i >= 0; i--) {
            count++;
            nb.append(ns.charAt(i));
            if (count == 3 && i != 0) {
                nb.append('.');
                count = 0;
            }
        }
        return nb.reverse().toString();
    }
}