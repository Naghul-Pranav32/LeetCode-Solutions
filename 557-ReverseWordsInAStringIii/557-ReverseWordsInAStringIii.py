# Last updated: 1/27/2026, 2:58:59 PM
class Solution:
    def reverseWords(self, s: str) -> str:
        l = s.split()
        a = [words[::-1] for words in l]
        return " ".join(a)