# Last updated: 1/27/2026, 2:57:33 PM
class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        return sum(nums) % k        