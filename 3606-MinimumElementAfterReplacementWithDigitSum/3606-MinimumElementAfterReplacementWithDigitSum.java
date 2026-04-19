// Last updated: 4/19/2026, 8:46:50 PM
class Solution {
    public int sumOfDigits(int x) {
            int sum = 0;
            while (x != 0) {
                int l = x % 10;
                sum += l;
                x /= 10;
            }
            return sum;
    }
    public int minElement(int[] nums) {
        int result = Integer.MAX_VALUE;
        for (int i : nums) 
            result = Math.min(result, sumOfDigits(i));
        return result;    
    }
}