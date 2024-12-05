import java.util.Arrays;

class MinNoGame_2974 {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        int index = 0;
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int alice = nums[left++];
            int bob = nums[left++];
            arr[index++] = bob;
            arr[index++] = alice;
        }

        return arr;
    }
}
