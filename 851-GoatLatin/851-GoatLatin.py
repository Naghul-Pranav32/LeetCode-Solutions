# Last updated: 6/4/2026, 10:43:24 AM
class Solution(object):
    def toGoatLatin(self, sentence):
        """
        :type sentence: str
        :rtype: str
        """
        vowels = ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        words = sentence.split()
        count = 1
        for i in range(0, len(words)):
            if words[i].startswith(vowels):
                words[i] = words[i] + "ma"
            else:
                words[i] = words[i][1:] + words[i][0]
                words[i] = words[i] + "ma"
            words[i] = words[i] + 'a' * count
            count += 1
        return ' '.join(words)