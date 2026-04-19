// Last updated: 4/19/2026, 8:46:31 PM
class Solution {
    public String trimTrailingVowels(String s) {
        int i = s.length() - 1;
        while (i >= 0 && isIndex(s.charAt(i))) {
            i--;
        }
        return s.substring(0, i + 1);
    }
    public static boolean isIndex(char a) {
        return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u';
    }
}