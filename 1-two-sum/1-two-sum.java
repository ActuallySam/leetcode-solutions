class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = nums.length;
        int[] result = new int[2];
        
        for (int i=0; i<n; i++) {
            int x = nums[i];
            int y = target - x;
            
            if (map.containsKey(y)) {
                result[0] = i;
                result[1] = map.get(y);
                return result;
            }
            
            map.put(x, i);
        }
        return result;
    }
}