// Last updated: 6/4/2026, 10:44:05 AM
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;
        int count = 0;
        int start = 0, end = 0;
        start = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == (nums[i] + 1)) {
                count++;
                end = nums[i + 1];
            } else {
                if (count != 0) {
                    result.add(start + "->" + end);
                    start = nums[i + 1];
                    count = 0;
                } else {
                    result.add(String.valueOf(start));
                    start = nums[i + 1];
                }
            }
        }
        if (count != 0) result.add(start + "->" + end);
        else result.add(String.valueOf(start));
        return result;
    }
}