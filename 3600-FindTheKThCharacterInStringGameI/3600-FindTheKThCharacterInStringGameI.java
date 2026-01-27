// Last updated: 1/27/2026, 2:57:38 PM
class Solution {
    public char kthCharacter(int k) {
        StringBuffer word = new StringBuffer("a");
        while(word.length() < k){
            int t = word.length();
            for(int i = 0; i < t; i++){
                word.append((char)(word.charAt(i)+1));
            }
        }
        return word.charAt(k-1);
    }
}