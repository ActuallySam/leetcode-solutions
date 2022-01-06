class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        int n = nums.length;
        int count = 0;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<n; i++) {            
            map.put(nums[i], map.getOrDefault(nums[i], count) + 1);
            if(map.get(nums[i]) >=2)
               return true;
        }

        return false;
    }
}