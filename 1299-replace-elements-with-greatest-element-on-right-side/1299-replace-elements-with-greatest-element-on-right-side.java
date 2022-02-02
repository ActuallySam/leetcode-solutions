class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] nums = new int[n];
        int maxval = -1;
        nums[n-1] = -1;
        
        for (int i=n-2; i>=0; i--) {
            maxval = Math.max(maxval, arr[i+1]);
            nums[i] = maxval;
        }
        
        return nums;
    }
}