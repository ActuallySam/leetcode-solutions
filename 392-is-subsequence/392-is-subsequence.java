class Solution {
    public boolean isSubsequence(String s, String t) {        
        int s_len = s.length();
        int t_len = t.length();
        int i = 0, j = 0;
        
        if (s_len == 0)
            return true;
        
        while (j < t_len) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                if (i == s_len)
                    return true;
            }
            j++;
        }
        return false;
    }
}