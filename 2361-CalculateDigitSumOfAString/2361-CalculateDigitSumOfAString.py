# Last updated: 1/27/2026, 2:58:08 PM
class Solution(object):
    def digitSum(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: str
        """
        while len(s) > k:
            snew = ""
            for i in range(0, len(s), k):
                snew += str(sum(int(ch) for ch in s[i:i+k]))
            s = snew
        return s