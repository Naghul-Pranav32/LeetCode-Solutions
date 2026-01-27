# Last updated: 1/27/2026, 3:00:01 PM
class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        str_digits = "".join(str(digit) for digit in digits)
        int_digits = int(str_digits) + 1
        result = [int(digit) for digit in str(int_digits)]
        return result