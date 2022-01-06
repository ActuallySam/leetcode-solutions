class Solution {
    public int findNumbers(int[] nums) {
        int num_count = 0;
        int n = nums.length;
        
        for (int i=0; i<n; i++) {
            int count = 0;
            while (nums[i] != 0) {
                ++count;
                nums[i] = nums[i] / 10;
            }
            if (count % 2 == 0) 
                num_count += 1;
        }
        return num_count;
    }
}