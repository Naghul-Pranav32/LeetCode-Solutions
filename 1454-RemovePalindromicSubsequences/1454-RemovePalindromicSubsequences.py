# Last updated: 1/27/2026, 2:58:38 PM
class Solution:
    def removePalindromeSub(self, s: str) -> int:
        if s == s[::-1]: return 1
        else: return 2