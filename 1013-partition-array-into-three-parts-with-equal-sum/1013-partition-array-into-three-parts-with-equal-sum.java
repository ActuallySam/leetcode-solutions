class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        int n = arr.length;
        
        for (int num: arr) 
            sum += num;
        
        if (sum % 3 != 0)
            return false;
        
        sum /= 3;
        
        int currentSum = 0;
        int sections = 0;
        for (int i=0; i<n; i++) {
            currentSum += arr[i];
            
            if (currentSum == sum && sections <= 2) {
                sections++;
                currentSum = 0;
            }
        }
        
        return (currentSum == 0 && sections == 3);
    }
}