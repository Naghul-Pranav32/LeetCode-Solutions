// Last updated: 1/27/2026, 2:58:10 PM
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        if (nums.length < 3) return nums;
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            if (i % 2 == 0) even.add(nums[i]);
            else odd.add(nums[i]);
        }
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());
        int j = 0, k = 0;
        for(int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = even.get(j);
                j++;
            }
            else {
                result[i] = odd.get(k);
                k++;
            }
        }
        return result;
    }
}