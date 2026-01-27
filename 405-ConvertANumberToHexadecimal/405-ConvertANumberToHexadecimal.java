// Last updated: 1/27/2026, 2:59:09 PM
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        StringBuffer s = new StringBuffer();
        final char[] map = "0123456789abcdef".toCharArray();
        while (num != 0) {
            int d = num & 15;
            s.append(map[d]);
            num >>>= 4;
        }
        return s.reverse().toString();
    }
}