# Last updated: 1/27/2026, 2:59:35 PM
class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        for i in range(31):
            if 2 ** i == n:
                return True
        return False
        
