# Last updated: 1/27/2026, 2:57:45 PM
class Solution:
    def minimumAverage(self, nums: List[int]) -> float:
        averages = []
        nums.sort()
        i, j = 0, len(nums) - 1
        while i < j:
            avg = (nums[i] + nums[j])/2
            averages.append(avg)
            i += 1
            j -= 1
        return min(averages)