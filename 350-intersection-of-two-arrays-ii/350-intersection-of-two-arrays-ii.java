class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        ArrayList<Integer> array = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i=0; i<n1; i++) {
            if (!map.containsKey(nums1[i]))
                map.put(nums1[i], 1);
            else
                map.put(nums1[i], map.get(nums1[i]) + 1);
        }
        
        for (int i=0; i<n2; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                array.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
        
        int[] result = new int[array.size()];
        for(int i=0;i<array.size();i++)
            result[i] = (int)array.get(i);
        
       return result;
    }
}