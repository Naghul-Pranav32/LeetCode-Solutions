// Last updated: 2/3/2026, 11:13:09 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        double mavg = Integer.MIN_VALUE;
4        int total = 0;
5        for (int i = 0; i < k; i++) total += nums[i];
6        int mtotal = total;
7        for (int i = k; i < nums.length; i++) {
8            total += nums[i];
9            total -= nums[i - k];
10            mtotal = Math.max(total, mtotal);
11        }
12        return (double)mtotal/k;
13    }
14}