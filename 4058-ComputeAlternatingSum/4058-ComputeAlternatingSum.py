# Last updated: 1/27/2026, 2:57:30 PM
class Solution:
    def alternatingSum(self, nums: List[int]) -> int:
        result = 0
        if len(nums) == 1: return nums[0]
        for i in range(len(nums)):
            if i%2 == 0: result += nums[i]
            else: result -= nums[i]
        return result