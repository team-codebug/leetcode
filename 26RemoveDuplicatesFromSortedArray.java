class Solution {
    /*
    [0,1,2,3,4,2,2,3,3,4]
    i = 1
    j = 0
    i = 2
    j = 1
    i = 5
    j = 2
    i = 7
    j = 3
    i = ...
    j = 5
    */
    public int removeDuplicates(int[] nums) {
        int i = 0,
            j = 0;
        
        while (i < nums.length) {
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i += 1;
            }
            
            // 1 2 2 2 3 3 3 
            nums[j] = nums[i];
            i += 1;
            j += 1;
        }
        
        return j;
    }
}
