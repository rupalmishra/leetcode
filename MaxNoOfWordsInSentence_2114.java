    class MaxNoOfWordsInSentence_2114 {
        public int mostWordsFound(String[] sentences) {
            int maxWords = 0;
            for (String sentence : sentences) {
                int wordCount = sentence.split(" ").length;
                maxWords = Math.max(maxWords, wordCount);
            }
            return maxWords;
        }
    }

