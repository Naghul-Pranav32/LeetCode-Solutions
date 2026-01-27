// Last updated: 1/27/2026, 2:58:56 PM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> s = new Stack();
        int[] res = new int[n];
        Arrays.fill(res, 0);
        for (int i = 0; i < n; i++) {
            while(!s.empty() && temperatures[i] > temperatures[s.peek()]) {
                res[s.peek()] = i - s.peek();
                s.pop();
            }
            s.push(i);
        }
        return res;
    }
}