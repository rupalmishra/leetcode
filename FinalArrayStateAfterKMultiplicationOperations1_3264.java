class FinalArrayStateAfterKMultiplicationOperations1_3264 {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int minIndex = findMinIndex(nums);
            nums[minIndex] *= multiplier;
        }
        return nums;
    }

    private int findMinIndex(int[] nums) {
        int minIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
