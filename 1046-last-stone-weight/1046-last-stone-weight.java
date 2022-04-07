class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        
        if (n == 1)
            return stones[0];
        
        int[] newStones = new int[n-1];
        Arrays.sort(stones);
        
        if (stones[n-1] == stones[n-2]) {
            for (int i=0; i<n-2; i++)
                newStones[i] = stones[i];
        }
        else if(stones[n-1] != stones[n-2]) {
            stones[n-2] = stones[n-1] - stones[n-2];
            for (int i=0; i<n-1; i++)
                newStones[i] = stones[i];
        }
        return lastStoneWeight(newStones);
    }
}