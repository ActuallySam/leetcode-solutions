class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // Faaltu Method
//         int n = arr.length;
//         int[] nums = new int[n];
//         for (int i=0; i<n; i++) 
//             nums[i] = arr[i];
//         Arrays.sort(nums);
//         int number = nums[n-1];
        
//         for (int i=0; i<n; i++) {
//             if (arr[i] == number)
//                 return i;
//         }
//         return -1;
        
        // Binary Search
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        
        while (i < j) {
            int mid = (i + j) / 2;
            if (arr[mid] < arr[mid + 1])
                i = mid + 1;
            else
                j = mid;
        }
        return i;
    }
}