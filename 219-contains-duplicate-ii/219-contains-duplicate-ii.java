class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        
        // for (int i=0; i<n; i++) {
        //     int j = i + 1; 
        //     int difference = Math.abs(i - j);
        //     while (j < n) {
        //         if ((nums[i] == nums[j]) && (difference <= k))
        //             return true;
        //         j++;   
        //     }
        // }
        // return false;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i=0; i<n; i++) {
            if (map.containsKey(nums[i]) && Math.abs(i - map.get(nums[i])) <= k) 
                return true;
            map.put(nums[i], i);
        }
        return false;
    }
}