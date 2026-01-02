class Solution {
    public int repeatedNTimes(int[] nums) {
        // Traverse each element
        for(int i = 0; i < nums.length; i++){
            // Check against all subsequent elements
            for(int j = i + 1; j < nums.length; j++){
                // Compare VALUES, not indices
                if(nums[i] == nums[j]){
                    return nums[i];  // Found the repeated element
                }
            }
        }
        return -1;  // Should never reach here given constraints
    }
}
