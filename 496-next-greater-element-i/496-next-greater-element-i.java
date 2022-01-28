class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        int[] arr = new int[n1];
        Stack<Integer> st = new Stack<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<n2; i++) {
            while (!st.isEmpty() && st.peek() < nums2[i]) 
                map.put(st.pop(), nums2[i]);
            st.push(nums2[i]);
        }
        
        for (int i=0; i<n1; i++) {
            arr[i] = map.getOrDefault(nums1[i], -1);
        }
        
        return arr;
    }
}