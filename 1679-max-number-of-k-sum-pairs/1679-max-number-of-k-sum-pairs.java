class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        
        for (int i=0; i<n; i++) {
            if (map.containsKey(k - nums[i]) && map.get(k - nums[i]) > 0) {
                count++;
                map.put(k - nums[i], map.get(k - nums[i]) - 1);
            }
            else
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return count;
    }
}