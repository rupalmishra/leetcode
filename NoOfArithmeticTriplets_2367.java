class NoOfArithmeticTriplets_2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;

        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        for (int num : nums) {
            if (numSet.contains(num + diff) && numSet.contains(num + 2 * diff)) {
                count++;
            }
        }

        return count;
    }
}
