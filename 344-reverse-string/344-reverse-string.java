class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length;
        
        while (i < j/2) {
            char temp = s[i];
            s[i] = s[j - i - 1];
            s[j - i - 1] = temp;
            i++;
        }
    }
}