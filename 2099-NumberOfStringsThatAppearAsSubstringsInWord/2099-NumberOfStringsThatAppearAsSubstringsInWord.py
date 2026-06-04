# Last updated: 6/4/2026, 10:42:38 AM
class Solution:
    def numOfStrings(self, patterns: List[str], word: str) -> int:
        count = 0
        for i in patterns:
            if word.find(i) != -1:
                count += 1
        return count