# Last updated: 1/27/2026, 2:58:35 PM
class Solution:
    def findLucky(self, arr: List[int]) -> int:
        frequency = {}
        for i in arr:
            if i in frequency: frequency[i] += 1
            else: frequency[i] = 1
        max_count = -1
        for key, value in frequency.items():
            if key == value: max_count = max(max_count, value)
        return max_count