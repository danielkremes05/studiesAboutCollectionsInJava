package collections.set_interfaces.BasicOperationsWithSet.UniqueWords.uniqueWords;

import java.util.Objects;

public class UniqueWords {

    private String uniqueWord;

    public UniqueWords (String uniqueWord) {
        this.uniqueWord = uniqueWord;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniqueWords that = (UniqueWords) o;
        return Objects.equals(uniqueWord, that.uniqueWord);
    }

    public String getUniqueWord () {
        return uniqueWord;
    }

    @Override
    public int hashCode () {
        return Objects.hash(uniqueWord);
    }

}
