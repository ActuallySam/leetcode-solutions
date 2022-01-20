class Solution {
    public int findDuplicate(int[] nums) {
        // HashMap method
//         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//         int n = nums.length;
//         int duplicate = 0;
        
//         for (int i=0; i<n; i++) {
//             if (!map.containsKey(nums[i]))
//                 map.put(nums[i], 1);
//             else 
//                 duplicate = nums[i];
//         }
//         return duplicate;
        
        // HashSet Method
        Set<Integer> set = new HashSet<Integer>();
        int n = nums.length;
        
        for (int i=0; i<n; i++) {
            if(set.contains(nums[i])) {
                return nums[i];
            }
            else
                set.add(nums[i]);
        }
        return 0;
    }
}