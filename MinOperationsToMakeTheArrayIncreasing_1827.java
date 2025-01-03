class MinOperationsToMakeTheArrayIncreasing_1827 {
    public int minOperations(int[] nums) {
        int operations = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int increment = nums[i - 1] - nums[i] + 1;
                nums[i] += increment;
                operations += increment;
            }
        }

        return operations;
    }
}