# Last updated: 1/27/2026, 2:57:39 PM
class Solution:
    def findClosest(self, x: int, y: int, z: int) -> int:
        if abs(x - z) > abs(y - z): return 2
        elif abs(y -z) > abs(x - z): return 1
        else: return 0