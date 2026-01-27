# Last updated: 1/27/2026, 2:58:33 PM
class Solution:
    def isPrefixOfWord(self, sentence: str, searchWord: str) -> int:
        split_sentence = sentence.split()
        for i in range(len(split_sentence)):
            if (split_sentence[i].startswith(searchWord)):
                return i+1
        return -1