# Last updated: 1/27/2026, 2:59:50 PM
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        seen = set()
        for num in nums:
            if num in seen:
                seen.remove(num)
            else:
                seen.add(num)
        return seen.pop()  # Returns the first (and only) unique if one exists