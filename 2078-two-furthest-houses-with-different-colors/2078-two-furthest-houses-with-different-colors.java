class Solution {
    public int maxDistance(int[] colors) {
        int maxd = Integer.MIN_VALUE;
        int n = colors.length;
        
        int left = 0; 
        int right = n - 1;
        
        while (colors[left] == colors[n-1])
            left++;
        while (colors[0] == colors[right])
            right--;
            
            return Math.max(right, n - left - 1);
    }
}