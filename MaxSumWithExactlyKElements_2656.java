import java.util.Arrays;

class MaxSumWithExactlyKElements_2656 {
    public int maximizeSum(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += max;
            max++;
        }

        return sum;
    }
}
