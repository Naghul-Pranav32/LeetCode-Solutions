# Last updated: 1/27/2026, 2:58:22 PM
class Solution(object):
    def secondHighest(self, s):
        """
        :type s: str
        :rtype: int
        """
        result = []
        for i in range(len(s)):
            if s[i].isdigit() and int(s[i]) not in result:
                result.append(int(s[i]))
        if len(result) < 2:
            return -1
        else:
            result.remove(max(result))
            return max(result)