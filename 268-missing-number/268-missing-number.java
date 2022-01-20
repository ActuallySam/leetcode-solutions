class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expected = 0, actual = 0;
        
        Arrays.sort(nums);
        
        for (int i=0; i<=n; i++)
            expected += i;
        
        for (int i=0; i<n; i++)
            actual += nums[i];
        
        return expected - actual;
    }
}