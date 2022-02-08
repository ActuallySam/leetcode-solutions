class Solution {
    public int addDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        
        if (sum >= 10) 
            return addDigits(sum);
        else
            return sum;
    }
}