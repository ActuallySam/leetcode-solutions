import java.util.HashMap;
import java.util.Map.Entry;

class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i=0; i<n; i++) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else
                map.put(nums[i], map.get(nums[i]) + 1);
        }
        
        int i = 0;
        int[] arr = new int[2];
        
        for (Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() == 1) {
                arr[i] = entry.getKey();
                i++;
            }
            else
                continue;
        }
        
        return arr;
    }
}