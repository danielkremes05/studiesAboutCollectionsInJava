package collections.set_interfaces.BasicOperationsWithSet.UniqueWords.uniqueWords;

import java.util.Objects;

/**
 * Represents a unique word with attributes such as the word itself.
 */
public class UniqueWords {

    private String uniqueWord;

    /**
     * Constructs a UniqueWords object with the specified unique word.
     * @param uniqueWord The unique word to be represented.
     */
    public UniqueWords(String uniqueWord) {
        this.uniqueWord = uniqueWord;
    }

    /**
     * Checks if this UniqueWords object is equal to another object.
     * Two UniqueWords objects are considered equal if they have the same unique word.
     * @param o The object to compare.
     * @return True if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniqueWords that = (UniqueWords) o;
        return Objects.equals(uniqueWord, that.uniqueWord);
    }

    /**
     * Retrieves the unique word represented by this UniqueWords object.
     * @return The unique word.
     */
    public String getUniqueWord() {
        return uniqueWord;
    }

    /**
     * Computes the hash code for this UniqueWords object.
     * @return The hash code for this object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(uniqueWord);
    }
}
