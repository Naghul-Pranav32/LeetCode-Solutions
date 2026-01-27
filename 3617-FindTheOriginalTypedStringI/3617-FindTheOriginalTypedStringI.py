# Last updated: 1/27/2026, 2:57:37 PM
class Solution:
    def possibleStringCount(self, word: str) -> int:
        n = len(word)
        for i in range(1,n):
            if word[i] != word[i-1]:
                n -=1
        return n