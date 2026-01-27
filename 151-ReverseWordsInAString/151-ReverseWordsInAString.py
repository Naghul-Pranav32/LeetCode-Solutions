# Last updated: 1/27/2026, 2:59:47 PM
class Solution:
    def reverseWords(self, s: str) -> str:
        s = s.strip().split()
        s = s[::-1]
        return " ".join(s)