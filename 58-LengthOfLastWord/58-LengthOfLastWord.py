# Last updated: 1/27/2026, 3:00:03 PM
class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        l=s.split()
        return len(l[len(l)-1])
