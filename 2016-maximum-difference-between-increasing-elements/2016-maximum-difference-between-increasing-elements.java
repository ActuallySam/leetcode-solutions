class Solution {
    public int maximumDifference(int[] nums) {
        int minElement = Integer.MAX_VALUE;
        int maxDiff = 0;
        int n = nums.length;
        
        for (int i=0; i<n; i++) {
            minElement = Math.min(minElement, nums[i]);
            maxDiff = Math.max(maxDiff, nums[i] - minElement);
        }
        
        if (maxDiff <= 0)
            return -1;
        else
            return maxDiff;
    }
}