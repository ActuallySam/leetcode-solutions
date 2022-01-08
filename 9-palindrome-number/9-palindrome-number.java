class Solution {
    public boolean isPalindrome(int x) {        
        if (x < 0)
            return false;
        
        int sum = 0, rem = 0, temp = x;
        while (x > 0) {
            rem = x % 10;
            sum = (sum * 10) + rem;
            x = x / 10;
        }
        
        if (sum == temp)
            return true;
        else
            return false;
    }
}