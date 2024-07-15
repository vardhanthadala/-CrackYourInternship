
public class Solution {
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
      
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {

                    row[i] = true;
                    col[j] = true;
                }
            }
        }
 // Set the corresponding rows to zero
        for (int i = 0; i < m; i++) {
            if (row[i]) {
                Arrays.fill(matrix[i], 0);
            }
        }
 // Set the corresponding cols to zero
        for (int j = 0; j < n; j++) {
            if (col[j]) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
