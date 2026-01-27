// Last updated: 1/27/2026, 2:57:42 PM
class Solution {
    public String winningPlayer(int x, int y) {
        int turn = 0;
        while (y >= 4 && x >= 1) {
            x -= 1;
            y -= 4;
            turn += 1;
        }
        return turn % 2 == 0 ? "Bob" : "Alice";
    }
}