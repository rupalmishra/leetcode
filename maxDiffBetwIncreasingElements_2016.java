class maxDiffBetwIncreasingElements_2016 {
    public int maximumDifference(int[] nums) {
        int maxDiff = -1;
        int minSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > minSoFar) {
                int diff = nums[i] - minSoFar;
                maxDiff = Math.max(maxDiff, diff);
            }
            minSoFar = Math.min(minSoFar, nums[i]);
        }

        return maxDiff;
    }
}
