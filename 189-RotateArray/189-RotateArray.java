// Last updated: 6/4/2026, 10:44:12 AM
class Solution {
    public void reverse(int[] nums, int left, int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        int x = k % nums.length;
        int left = 0; 
        int right = nums.length - 1;
        reverse(nums, left, right);
        reverse(nums, left, x - 1);
        reverse(nums, x, right);
    }
}