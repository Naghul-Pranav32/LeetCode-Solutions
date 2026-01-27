// Last updated: 1/27/2026, 2:57:57 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int element = 0;
        int digit = 0;
        for (int i : nums) {
            element += i;
            int temp = i;
            while (temp != 0) {
                int l = temp % 10;
                digit += l;
                temp /= 10;
            }
            
        }
        return Math.abs(element - digit);        
    }
}