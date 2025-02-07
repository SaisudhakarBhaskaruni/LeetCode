class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        
        // Normalize k to avoid unnecessary rotations
        k = k % n;
        if (k == 0) return; // No need to rotate

        int[] temp = new int[k];

        // Step 1: Store last k elements in temp array
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        // Step 2: Shift elements to the right by k places
        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        // Step 3: Copy stored elements from temp back to the beginning
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}
