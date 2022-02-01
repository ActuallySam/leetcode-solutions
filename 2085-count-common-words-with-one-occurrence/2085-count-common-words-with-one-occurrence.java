class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        int n1 = words1.length;
        int n2 = words2.length;
        
        // Putting the "words1" array in the map
        for (int i=0; i<n1; i++) {
            if (!map.containsKey(words1[i]))
                map.put(words1[i], 1);
            else 
                map.put(words1[i], map.get(words1[i]) + 1);
        }
        
        // Putting "words2" array in another map
        for (int i=0; i<n2; i++) {
            if (!map1.containsKey(words2[i])) 
                map1.put(words2[i], 1);
            else
                map1.put(words2[i], map1.get(words2[i]) + 1);
        }
        
        // traversing through the "words1" array 
        for (int i=0; i<n1; i++) {
            // Checking if the key is present and is matching in both maps
            // and if the key has appeared just one time in "map1" map
            if (map.get(words1[i]) == map1.get(words1[i]) && map1.get(words1[i]) == 1)
                count++;
        }
        
        return count;
    }
}