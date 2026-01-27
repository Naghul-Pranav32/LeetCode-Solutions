# Last updated: 1/27/2026, 2:58:13 PM
class Solution:
    def minimumCost(self, cost: List[int]) -> int:
        cost.sort(reverse = True)
        total, i = 0, 0
        while i < len(cost):
            total += sum(cost[i:i+2])
            i += 3
        return total