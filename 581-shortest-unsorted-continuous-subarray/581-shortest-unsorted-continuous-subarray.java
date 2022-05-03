class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        
        int min = nums[n - 1];
        int max = nums[0];
        int start = -1;
        int end = -2;
        
        for (int i=1; i<n; i++) {
            min = Math.min(min, nums[n - i - 1]);
            max = Math.max(max, nums[i]);
            
            if (min < nums[n - i - 1])
                start = n - i - 1;
            if (max > nums[i])
                end = i;
        }
        
        return end - start + 1;
    }
}