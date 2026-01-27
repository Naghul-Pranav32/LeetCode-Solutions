// Last updated: 1/27/2026, 3:00:16 PM
class Solution {
    public boolean isValid(String s) {
        Stack <Character> b = new Stack <>();
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (c == '(' || c == '[' || c == '{') b.push(c);
            else{
                if (b.empty()) return false;
                else if ( c == ')' && b.peek() == '(') b.pop();
                else if (c == ']' && b.peek() == '[') b.pop();
                else if (c == '}' && b.peek() == '{') b.pop();
                else return false;
            }
        }
        return b.isEmpty();
    }
}