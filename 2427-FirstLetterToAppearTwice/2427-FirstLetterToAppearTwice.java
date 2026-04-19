// Last updated: 4/19/2026, 8:47:11 PM
class Solution {
    public char repeatedCharacter(String s) {
        Set hs = new HashSet<>();
        for (char ch : s.toCharArray()) 
            if (!hs.contains(ch)) hs.add(ch);
            else return ch;
        return 'a';
    }
}