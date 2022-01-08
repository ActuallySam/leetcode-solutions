class Solution {
    public int mySqrt(int x) {
        if (x == 0)
            return 0;
        if (x == 1) 
            return 1;
        
        long low = 1;
        long high = x / 2;
        long ans = 0;
        
        while (low <= high) {
            long mid = (low + high) / 2;
            
            if (mid * mid == x)
                return (int)mid;
            else if (mid * mid < x) {
                low = mid + 1; 
                ans = mid;
            }
            else 
                high = mid - 1;
        }
        return (int)ans;
    }
}