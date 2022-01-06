class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        
        for (int i=0; i<n; i++) {
            int sq = (int)Math.pow(nums[i], 2);
            nums[i] = sq;
        }
        
        Arrays.sort(nums);
        
        return nums;
    }
}