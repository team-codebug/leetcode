class Solution {
    public int maxSubArray(int[] nums) {
        int globalSum = 0,
            maxSubArraySum = Integer.MIN_VALUE;
        // n, 1
        for (int idx = 0; idx < nums.length; idx += 1) {
            globalSum += nums[idx];
            
            maxSubArraySum = Math.max(maxSubArraySum, globalSum);
            
            if (globalSum < 0) {
                globalSum = 0;
            }
        }
        
        return maxSubArraySum;
    }
}
