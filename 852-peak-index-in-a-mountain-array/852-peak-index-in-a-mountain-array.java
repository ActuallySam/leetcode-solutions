class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // Faaltu Method
        int n = arr.length;
        int[] nums = new int[n];
        for (int i=0; i<n; i++) 
            nums[i] = arr[i];
        Arrays.sort(nums);
        int number = nums[n-1];
        
        for (int i=0; i<n; i++) {
            if (arr[i] == number)
                return i;
        }
        return -1;
    }
}