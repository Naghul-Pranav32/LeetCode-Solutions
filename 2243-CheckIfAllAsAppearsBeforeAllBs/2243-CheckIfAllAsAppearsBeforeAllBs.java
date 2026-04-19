// Last updated: 4/19/2026, 8:47:17 PM
class Solution {
    public boolean checkString(String s) {
        char[] ns = s.toCharArray();
        boolean result = true;
        boolean sus = false;
        for (int i = 0; i < ns.length - 1; i++) {
            if (ns[i] == 'b') sus = true;
            if (sus == true) 
                if (ns[i + 1] == 'a') result = false;
        }
        return result;
    }
}