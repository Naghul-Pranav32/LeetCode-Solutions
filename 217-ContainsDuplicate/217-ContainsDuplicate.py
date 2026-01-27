# Last updated: 1/27/2026, 2:59:32 PM
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        seen=set()
        for i in nums:
            if i in seen:
                return True
            seen.add(i)
        return False
        