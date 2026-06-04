// Last updated: 6/4/2026, 3:22:14 PM
1// Using DP, Iterative with 2 Variables.  [ O(n) Time Complexity ]
2
3class Solution {
4    public int fib(int n) {
5        if (n <= 1) return n;
6
7        int prev2 = 0; // F(0)
8        int prev1 = 1; // F(1)
9
10        for (int i = 2; i <= n; i++) {
11            int curr = prev1 + prev2;
12            prev2 = prev1;
13            prev1 = curr;
14        }
15
16        return prev1;
17    }
18}
19
20// Using Recursion
21
22// class Solution {
23//     public int fib(int n) {
24//         if(n == 0) return 0;
25//         if(n == 1) return 1;
26//         else return fib(n-1) + fib(n-2);     [ O(2^n) Time Complexity ]
27//     }
28// }