import java.util.Arrays;

class MaxProdOfTwoElementsInAArray_1464 {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return ((nums[n - 1] - 1) * (nums[n - 2] - 1));
    }
}
