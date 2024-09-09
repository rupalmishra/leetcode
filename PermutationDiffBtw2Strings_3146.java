    class PermutationDiffBtw2Strings_3146 {
        public int findPermutationDifference(String s, String t) {
            int difference = 0;
            for (char c : s.toCharArray()) {
                int indexS = s.indexOf(c);
                int indexT = t.indexOf(c);
                difference += Math.abs(indexS - indexT);
            }
            return difference;
        }
    }

