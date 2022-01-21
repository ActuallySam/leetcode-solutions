class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        // HashSet Soolution
//         int n = nums.length;
             
//         List<Integer> list = new ArrayList<Integer>();
//         Set<Integer> set = new HashSet<Integer>();
        
//         for (int i=0; i<n; i++) {
//             if (!set.contains(nums[i]))
//                 set.add(nums[i]);
//             else
//                 list.add(nums[i]);
//         }
//         return list;
        
        
        // Using Cyclic Sort and listing out the elements that are not present in their resp. positions in the array
        int n = nums.length;
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;
        
        // Sorting the entire array using cyclic sort
        while(i < n) {
            int correct_index = nums[i] - 1;    // Correct index of the element of at what position it should actually be,  and to cyclically sort the entire array
            if (nums[i] != nums[correct_index]) {
                int temp = nums[correct_index];
                nums[correct_index] = nums[i];
                nums[i] = temp;
            }
            else 
                i++;
        }
        
        for (int j=0; j<n; j++) {
            if (nums[j] != j+1)
                list.add(nums[j]);
        }
        return list;
    }
}