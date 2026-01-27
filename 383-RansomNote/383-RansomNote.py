# Last updated: 1/27/2026, 2:59:13 PM
class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        # Initialize a dictionary to count characters in magazine
        magazine_counts = {}
        
        # Count each character in magazine
        for char in magazine:
            if char in magazine_counts:
                magazine_counts[char] += 1
            else:
                magazine_counts[char] = 1
        
        # Check each character in ransomNote
        for char in ransomNote:
            if char in magazine_counts and magazine_counts[char] > 0:
                magazine_counts[char] -= 1
            else:
                return False
        return True