class Solution {
    public boolean search(int[] nums, int target) {
        // 
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (nums[mid] == target) 
                return true;
            
            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target <= nums[mid])
                    high = mid - 1;
                else
                    low = low + 1;
            }
            
            else {
                if (target >= nums[mid] && target <= nums[high])
                    low = low + 1;
                else 
                    high = mid - 1;
            }
        }
        return false;
        
        
        // Normal Binary Search
//         int n = nums.length;
//         Arrays.sort(nums);
        
//         int i = 0;
//         int j = n - 1;
//         while (i <= j) {
//             int mid = (i + j) / 2;
//             if (nums[mid] == target)
//                 return true;
//             else if (nums[mid] < target)
//                 i = mid + 1;
//             else
//                 j = mid - 1;
//         }
//         return false;
    }
}