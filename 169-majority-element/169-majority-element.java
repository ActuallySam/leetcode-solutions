class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 1;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i=0; i<=n-1; i++) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], count);
            else 
                map.put(nums[i], map.get(nums[i]) + 1);
            if (map.containsKey(nums[i]) && map.get(nums[i]) > n/2)
                return nums[i];
        }
        return -1;
    }
}