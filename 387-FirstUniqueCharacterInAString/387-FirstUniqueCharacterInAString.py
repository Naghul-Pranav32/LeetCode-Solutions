# Last updated: 1/27/2026, 2:59:19 PM
class Solution:
    def firstUniqChar(self, s: str) -> int:
        frequency = {}
        for i in s:
            frequency[i] = frequency.get(i, 0) + 1
        for i, v in enumerate(s):
            if frequency[v] == 1:
                return i
        return -1