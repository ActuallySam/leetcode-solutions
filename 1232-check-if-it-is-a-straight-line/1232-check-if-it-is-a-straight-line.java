class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0];
        int x1 = coordinates[1][0];
        int y0 = coordinates[0][1];
        int y1 = coordinates[1][1];
        
        int dx = x1 - x0;
        int dy = y1 - y0;
        int n = coordinates.length;
        
        for (int[] coord: coordinates) {
            int x = coord[0];
            int y = coord[1];
            
            if (dx * (y - y1) != dy * (x - x1))
                return false;
        }
        
        return true;
    }
}