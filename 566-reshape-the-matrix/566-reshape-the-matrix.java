class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] reshape = new int[r][c];
        int[] arr = new int[m*n];
        
        if (r * c != m * n) 
            return mat;
        
        int k = 0;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) 
                arr[k++] = mat[i][j];
        }
        
        k = 0;
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) 
                reshape[i][j] = arr[k++];
        }
        
        return reshape;
    }
}