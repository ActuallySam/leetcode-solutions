class Solution {
    public char findTheDifference(String s, String t) {
        int m = s.length();
        int n = t.length();
        char ch = 'A';
        
        char char_s_Array[] = s.toCharArray();
        Arrays.sort(char_s_Array);
        String str1 = new String(char_s_Array);
        
        char char_t_Array[] = t.toCharArray();
        Arrays.sort(char_t_Array);
        String str2 = new String(char_t_Array);
        
        for (int i=0; i<m; i++) {
            if (str1.charAt(i) == str2.charAt(i))
                continue;
            else {
                ch = str2.charAt(i);
                break;
            }
        }
        if (ch == 'A') {
            ch = str2.charAt(n - 1);
        }
        return ch;
    }
}