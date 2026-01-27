// Last updated: 1/27/2026, 2:59:46 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuffer res = new StringBuffer("");
        while (columnNumber > 0) {
            columnNumber--;
            res.append((char)((columnNumber % 26) + 65));
            columnNumber /= 26;
        }
        return res.reverse().toString();
    }
}