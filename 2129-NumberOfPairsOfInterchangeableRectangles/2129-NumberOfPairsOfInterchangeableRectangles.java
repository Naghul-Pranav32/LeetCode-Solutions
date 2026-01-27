// Last updated: 1/27/2026, 2:58:15 PM
class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
       Map <Double, Integer> freq = new HashMap<>();
       int n = rectangles.length;
       long pairs = 0;
       for (int[] i : rectangles) {
            double r = (double)i[0] / i[1];
            pairs += freq.getOrDefault(r, 0);
            freq.put(r, freq.getOrDefault(r, 0) + 1);
       }
       return pairs;
    }
}