# Last updated: 1/27/2026, 2:58:18 PM
class Solution:
    def areOccurrencesEqual(self, s: str) -> bool:
        frequency = Counter(s)
        return len(set(frequency.values())) == 1