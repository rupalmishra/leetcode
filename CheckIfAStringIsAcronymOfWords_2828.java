import java.util.List;

class CheckIfAStringIsAcronymOfWords_2828 {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder acronym = new StringBuilder();

        for (String word : words) {
            acronym.append(word.charAt(0));
        }

        return acronym.toString().equals(s);
    }
}
