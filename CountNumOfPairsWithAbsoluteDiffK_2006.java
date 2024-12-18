import java.util.HashMap;

class CountNumOfPairsWithAbsoluteDiffK_2006 {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;

        for (int num : nums) {

            if (freqMap.containsKey(num + k)) {
                count += freqMap.get(num + k);
            }
            if (freqMap.containsKey(num - k)) {
                count += freqMap.get(num - k);
            }

            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}
