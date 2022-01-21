class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        
        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        
        for (int i=0; i<n; i++) {
            if (!set.contains(nums[i]))
                set.add(nums[i]);
            else
                continue;
        }
        
        for (int i=0; i<n; i++) {
            if(!set.contains(i+1))
                list.add(i+1);
        }
         
        return list;
    }
}