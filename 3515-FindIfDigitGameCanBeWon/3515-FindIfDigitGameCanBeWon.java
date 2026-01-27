// Last updated: 1/27/2026, 2:57:41 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int single = 0;
        int doubles = 0;
        for (int i : nums) {
            if (i <= 9) single += i;
            else doubles += i;
        }
        return single == doubles ? false : true;
    }
}