class Solution {
    public boolean isPalindrome(String s) {
        
        int n = s.length();
        int left = 0;
        int right = n - 1;
        s = s.toLowerCase();
        
        if (s == "")
            return false;
        
        while(left < n) {
            while ((left < n) && (!Character.isLetterOrDigit(s.charAt(left))))
                left++;
            while ((right >= 0) && (!Character.isLetterOrDigit(s.charAt(right))))
                right--;
            
            if (left == n || right == -1)
                break;
            if (s.charAt(left) != s.charAt(right))
                return false;
            
            left++;
            right--;
        }
        return true;
    }
}