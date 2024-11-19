class SumOfAllSubsetXORTotal_1863 {
    public int subsetXORSum(int[] nums) {
        return calculateXORSum(nums, 0, 0);
    }
    private int calculateXORSum(int[] nums, int index, int currentXOR) {
        if (index == nums.length) {
            return currentXOR;
        }
         return calculateXORSum(nums, index + 1, currentXOR ^ nums[index]) 
             + calculateXORSum(nums, index + 1, currentXOR);
    }
}