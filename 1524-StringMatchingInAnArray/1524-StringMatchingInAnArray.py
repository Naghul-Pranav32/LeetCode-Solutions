# Last updated: 1/27/2026, 2:58:34 PM
class Solution:
    def stringMatching(self, words: List[str]) -> List[str]:
        n = len(words)
        ans = []

        for i in range(n):
            for j in range(n):
                if i != j and words[j].find(words[i]) != -1:
                    ans.append(words[i])
                    break

        return ans