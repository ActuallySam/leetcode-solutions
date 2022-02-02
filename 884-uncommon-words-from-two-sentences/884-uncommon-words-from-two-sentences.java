class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        int n1 = arr1.length;
        int n2 = arr2.length;
        List<String> list = new ArrayList<String>();
        
        for (int i=0; i<n1; i++) {
            if (!map.containsKey(arr1[i]))
                map.put(arr1[i], 1);
            else 
                map.put(arr1[i], map.get(arr1[i]) + 1);
        }
        
        for (int i=0; i<n2; i++) {
            if (!map.containsKey(arr2[i]))
                map.put(arr2[i], 1);
            else
                map.put(arr2[i], map.get(arr2[i]) + 1);
        }
        
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() == 1)
                list.add(entry.getKey());
        }
        
        int n = list.size();
        String[] res = new String[n];
        for (int i=0; i<n; i++) {
            res[i] = list.get(i);
        }
        
        return res;
    }
}