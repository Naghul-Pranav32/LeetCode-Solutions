# Last updated: 1/27/2026, 2:59:15 PM
class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = ["a","e","i","o","u","A","E","I","O","U"]
        res = []
        for i in range(len(s)):
            if s[i] in vowels:
                res.append(s[i])
        new = ""
        for i in range(len(s)):
            if s[i] in vowels:
                new += res.pop()
            else:
                new += s[i]
        return new 