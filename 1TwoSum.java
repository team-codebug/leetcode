class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        // num -> index
        
        for (int idx = 0; idx < nums.length; idx += 1) {
            // x + y = target
            // y = target - x
            int rem = target - nums[idx];
            
            if (map.containsKey(rem)) {
                return new int[] {
                    map.get(rem),
                    idx
                };
            }
            
            map.put(nums[idx], idx);
        }
        
        return new int[] {
            -1, -1
        };
    }
}
