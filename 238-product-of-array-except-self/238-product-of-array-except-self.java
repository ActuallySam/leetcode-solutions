class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int preProduct = 1, postProduct = 1;
        int[] res = new int[n];
        
        for (int i=0; i<n; i++) {
            res[i] = preProduct;
            preProduct = preProduct * nums[i];
        }
        
        for (int i=n-1; i>=0; i--) {
            res[i] = res[i] * postProduct;
            postProduct = postProduct * nums[i];
        }
        
        return res;
    }
}