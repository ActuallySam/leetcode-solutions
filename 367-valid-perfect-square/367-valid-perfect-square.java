class Solution {
    public boolean isPerfectSquare(int num) {
        long low = 1;
        long high = num / 2;
        long ans = 0;
        
        if (num == 1)
            return true;
        
        while (low <= high) {
            long mid = (low + high) / 2;
            
            if (mid * mid == num)
                return true;
            else if (mid * mid < num) {
                low = mid + 1;
                ans = mid;
            }
            else
                high = mid - 1;
        }
        return (int)(ans * ans) == num;
    }
}