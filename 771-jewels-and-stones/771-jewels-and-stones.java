class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;  
        int s_len = stones.length();
        int j_len = jewels.length();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        // Enter the stones in the HashMap
        for (int i=0; i<s_len; i++) {
            if (!map.containsKey(stones.charAt(i)))
                map.put(stones.charAt(i), 1);
            else
                map.put(stones.charAt(i), map.get(stones.charAt(i)) + 1);
        }
        
        for (int i=0; i<j_len; i++) {
            if (map.containsKey(jewels.charAt(i)))
                count += map.get(jewels.charAt(i));
        }
        
        return count;
    }
}