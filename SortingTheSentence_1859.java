    class SortingTheSentence_1859 {
            public String sortSentence(String s) {
                String[] words = s.split(" ");
                String[] results= new String[words.length];
        
                for(String word: words){
                    int position = word.charAt(word.length()-1)-'1';
                    results[position]=word.substring(0,word.length()-1);
                }
                return String.join(" ", results);
            }
        }
    

