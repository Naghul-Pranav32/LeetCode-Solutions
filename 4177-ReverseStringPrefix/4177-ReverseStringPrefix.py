# Last updated: 1/27/2026, 2:57:34 PM
class Solution:
    def reversePrefix(self, s: str, k: int) -> str:
        return s[:k][::-1] + s[k:]