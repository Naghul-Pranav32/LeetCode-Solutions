// Last updated: 6/4/2026, 3:21:35 PM
1class Solution {
2    public int fib(int n) {
3        return F(n);
4    }
5
6    private int F(int n) {
7        if (n == 0) return 0;  // base case
8        if (n == 1) return 1;  // base case
9        return F(n - 1) + F(n - 2); // recursive case
10    }
11}