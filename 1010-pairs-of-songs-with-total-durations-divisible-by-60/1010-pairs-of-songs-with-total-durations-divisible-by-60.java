class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int n = time.length;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        
        for (int i=0; i<n; i++) {
            count += map.getOrDefault((60 - time[i] % 60) % 60, 0);
            map.put(time[i] % 60, map.getOrDefault((time[i] % 60), 0) + 1);
        }
        
        return count;
    }
}