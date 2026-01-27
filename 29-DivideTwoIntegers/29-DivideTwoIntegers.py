# Last updated: 1/27/2026, 3:00:08 PM
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        intmin = -2 ** 31
        intmax = (2 ** 31) - 1 
        if dividend == intmin and divisor == -1:
            return intmax
        return int(dividend/divisor)