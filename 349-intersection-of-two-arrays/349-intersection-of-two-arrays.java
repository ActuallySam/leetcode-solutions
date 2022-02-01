class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        Set<Integer> set = new HashSet<Integer>();
        
        for (int i=0; i<n1; i++) {
            if (!set.contains(nums1[i]))
                set.add(nums1[i]);
        }
        
        for (int i=0; i<n2; i++) {
            if (set.contains(nums2[i])) {
                array.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        
        int result[] = new int[array.size()];
        for (int i=0; i<array.size(); i++) 
            result[i] = array.get(i);
        
        return result;
    }
}