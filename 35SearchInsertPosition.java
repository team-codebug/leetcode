class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0,
            right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                // target < nums[mid]
                right = mid - 1;
            }
        }
        
        return left; // when target is not present in the array...
    }
}
