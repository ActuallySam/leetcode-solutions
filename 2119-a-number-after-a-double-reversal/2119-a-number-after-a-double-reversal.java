class Solution {
    public boolean isSameAfterReversals(int num) {
                
        if (reverse(reverse(num)) == num)
            return true;
        
        return false;
    }
    
    int reverse (int num) {
        int sum = 0;
        
        while (num != 0) {
            int rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }
        return sum;
    } 
}