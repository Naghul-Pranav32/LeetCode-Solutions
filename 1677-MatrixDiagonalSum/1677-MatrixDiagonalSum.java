// Last updated: 1/27/2026, 2:58:27 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
        }
        int j = mat.length - 1, i = 0;
        for (int k = 1; k <= mat.length; k++) {
            if (i != j) sum += mat[i][j];
            i++; j--;
        }
        return sum; 
    }
}