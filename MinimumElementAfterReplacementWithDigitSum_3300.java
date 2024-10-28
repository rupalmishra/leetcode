class MinimumElementAfterReplacementWithDigitSum_3300 {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            int digitSum = sumOfDigits(num);
            min = Math.min(min, digitSum);
        }

        return min;
    }

    private int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
