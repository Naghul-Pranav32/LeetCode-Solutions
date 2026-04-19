// Last updated: 4/19/2026, 8:46:39 PM
class Solution {
    public long removeZeros(long n) {
        String ns = String.valueOf(n);
        StringBuilder res = new StringBuilder();
        for(char ch : ns.toCharArray()) {
            if (ch != '0') res.append(ch);
        }
        long num = Long.parseLong(res.toString());
        return num;
    }
}