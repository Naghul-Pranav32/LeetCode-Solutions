# Last updated: 1/27/2026, 2:59:55 PM
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if n == 0: return
        nums1[m:] = nums2
        nums1.sort()
        