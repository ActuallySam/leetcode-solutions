class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int left = 0;
        int right = n;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (letters[mid] > target)
                right = mid;
            else
                left = mid + 1;
        }
        
        return letters[left % n];
    }
}