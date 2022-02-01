class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n = arr.length;
        int count = 0;
        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        
        for (int i=0; i<n; i++) {
            if (!map.containsKey(arr[i]))
                map.put(arr[i], true);
            else 
                map.put(arr[i], false);
        }
        
        for (int i=0; i<n; i++) {
            if (map.get(arr[i]) == true) {
                count++;
                if (count == k)
                    return arr[i];
            }
        }
        
        return "";
    }
}