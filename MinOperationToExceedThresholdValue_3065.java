class MinOperationToExceedThresholdValue_3065 {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < k) {
                count++;
            }
        }
        return count;
    }
}
