class CheckIfNumAreAscendingInASentence_2042 {
    public boolean areNumbersAscending(String s) {
        String[] parts = s.split(" ");
        int prevNum = -1; // used to keep track of the last number that was processed as the code checks
                          // the numbers in the sentence. This helps determine whether the current number
                          // is strictly greater than the previous one.
        for (String part : parts) {
            if (Character.isDigit(part.charAt(0))) {
                int currentNum = Integer.parseInt(part);
                if (currentNum <= prevNum) {
                    return false;
                }
                prevNum = currentNum;
            }
        }
        return true;
    }
}
