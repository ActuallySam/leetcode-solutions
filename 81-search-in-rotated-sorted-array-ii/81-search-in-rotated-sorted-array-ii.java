class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target)
                return true;
            else if (nums[mid] < target)
                i = mid + 1;
            else
                j = mid - 1;
        }
        return false;
    }
}