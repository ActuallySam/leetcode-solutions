class Solution {
    public int lengthOfLongestSubstring(String s) {
//         int n = s.length();
        
//         HashSet<Character> set = new HashSet<Character>();
//         int count = 0;
//         int[] arr = new int[n];
        
//         for (int i=0; i<n; i++) {
//             if (!set.contains(s.charAt(i))) {
//                 set.add(s.charAt(i));
//                 count += 1;
//             } 
//             else {
//                 arr[i] = count;
//                 count = 0;
//             }
//         }
        
//         Arrays.sort(arr);
        
//         return arr[n-1];
        
        int n = s.length();
        int i = 0, j = 0 , len = 0;
        int[] arr = new int[256];
        
        while(j < n){
            
            int ind = s.charAt(j); 
            
            while(arr[ind] == 0){
                arr[ind]++;
                j++;
                if(j < n){
                    ind = s.charAt(j);
                }
                else{
                    break;
                }
               
            }
            len = Math.max(len , j - i);
            
            while(arr[ind] > 0){
                int temp = s.charAt(i);
                arr[temp]--;
                i++;
                
            }
            
        }
        return len;
    }
}