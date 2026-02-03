// Last updated: 2/3/2026, 11:13:27 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int ba = 0;
        int bs = 0;
        for (int i = 0; i < dimensions.length; i++) {
            int s = dimensions[i][0]*dimensions[i][0] + dimensions[i][1]*dimensions[i][1];
            int a = dimensions[i][0] * dimensions[i][1];
            if (s > bs || (s == bs && a > ba)) {
                bs = s;
                ba = a;
            }
        }
        return ba;
    }
}