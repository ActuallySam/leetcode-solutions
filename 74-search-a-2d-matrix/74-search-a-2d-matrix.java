class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Binary Search
        int i = 0;
        int j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {            
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] < target)
                i++;
            else
                j--;
        }
        return false;
        
        
        // Brute Force Approach
//         int n = matrix.length;
//         int m = matrix[0].length;
        
//         for (int i=0; i<n; i++) {
//             for (int j=0; j<m; j++) {
//                 if (matrix[i][j] == target)
//                     return true;
//             }
//         }
//         return false;
    }
}