class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int min = Integer.MAX_VALUE;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            min = Math.min(min, nums[mid]);
            
            if (nums[high] <= nums[mid])
                low = mid + 1;
            
            else
                high = mid - 1;
        }
        
        return min;
    }
}