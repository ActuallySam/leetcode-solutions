class Solution {
    public int subtractProductAndSum(int n) {
        int temp = n;
        int temp1 = n;
        int sum = 0, rem1 = 0;
        int prod = 1, rem = 0;
        
        while (temp != 0) {
            rem = temp % 10;
            prod = prod * rem;
            temp = temp / 10;
        }
        System.out.println(prod);
        
        while (n > 0) {
            rem1 = n % 10;
            sum = sum + rem1;
            n = n / 10;
        }
        // System.out.println(sum);
        
        int result = prod - sum;
        return result;
    }
}