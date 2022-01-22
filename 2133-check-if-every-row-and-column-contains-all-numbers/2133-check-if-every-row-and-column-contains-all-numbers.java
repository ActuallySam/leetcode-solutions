class Solution {
    public boolean checkValid(int[][] matrix) {
        int row_count = matrix.length;
        int col_count = matrix[0].length;
        
        Set<Integer> set = new HashSet<Integer>();
        for (int i=1; i<=col_count; i++)
            set.add(i);
        
        for (int i=0; i<row_count; i++) {
            Set<Integer> set1 = new HashSet<Integer>();
            Set<Integer> set2 = new HashSet<Integer>();
            for (int j=0; j<col_count; j++) {
                set1.add(matrix[i][j]);
                set2.add(matrix[j][i]);
            }
            if (!set1.equals(set) || !set2.equals(set))
                return false;
        }
        return true;
    } 
}