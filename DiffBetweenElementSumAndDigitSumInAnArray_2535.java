class DiffBetweenElementSumAndDigitSumInAnArray_2535 {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0, digitSum = 0;

        for (int num : nums) {
            elementSum += num; 
            
            while (num > 0) {
                digitSum += num % 10; 
                num /= 10; 
            }
        }

        return Math.abs(elementSum - digitSum); 
    }
}