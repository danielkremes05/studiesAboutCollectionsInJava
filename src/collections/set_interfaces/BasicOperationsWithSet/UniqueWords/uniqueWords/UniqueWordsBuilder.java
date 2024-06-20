package collections.set_interfaces.BasicOperationsWithSet.UniqueWords.uniqueWords;

public class UniqueWordsBuilder {

    private String uniqueWord;

    public UniqueWordsBuilder uniqueWord (String uniqueWord) {
        this.uniqueWord = uniqueWord;
        return this;
    }

    public UniqueWords uniqueWordBuilder () {
        return new UniqueWords(uniqueWord);
    }


}
