class Solution {
    public int countElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int num: nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        
        int count = 0;
        for (int num: nums) {
            if (num > min && num < max)
                count++;
        }
        
        return count;
    }
}