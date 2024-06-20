package collections.set_interfaces.BasicOperationsWithSet.UniqueWords.uniqueWords;

/**
 * Builder class for creating UniqueWords objects.
 */
public class UniqueWordsBuilder {

    private String uniqueWord;

    /**
     * Sets the unique word for the UniqueWords object being built.
     *
     * @param uniqueWord The unique word to set.
     * @return The UniqueWordsBuilder instance for method chaining.
     */
    public UniqueWordsBuilder uniqueWord (String uniqueWord) {
        this.uniqueWord = uniqueWord;
        return this;
    }

    /**
     * Constructs a UniqueWords object using the provided unique word.
     *
     * @return A new UniqueWords object with the set unique word.
     */
    public UniqueWords uniqueWordBuilder() {
        return new UniqueWords(uniqueWord);
    }
}
