class ReversePrefixOfWord_2000 {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1)
            return word;
        String reversed = new StringBuilder(word.substring(0, index + 1)).reverse().toString();
        return reversed + word.substring(index + 1);
    }
}
