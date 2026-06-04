# Last updated: 6/4/2026, 10:43:36 AM
class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        b = [s[i:i+k] for i in range(0, len(s), k)]
        fs = ""
        for i, chunk in enumerate(b):
            if i%2 == 0:
                fs += chunk[::-1]
            else:
                fs += chunk
        return fs
