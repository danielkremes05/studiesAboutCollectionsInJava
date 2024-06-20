package collections.set_interfaces.BasicOperationsWithSet.UniqueWords.main;

import collections.set_interfaces.BasicOperationsWithSet.UniqueWords.uniqueWords.SetUniqueWords;
import collections.set_interfaces.BasicOperationsWithSet.UniqueWords.uniqueWords.UniqueWords;
import collections.set_interfaces.BasicOperationsWithSet.UniqueWords.uniqueWords.UniqueWordsBuilder;

public class Main {
    public static void main (String[] args) {

        UniqueWords uniqueWords = new UniqueWordsBuilder()
                .uniqueWord("Teste")
                .uniqueWordBuilder();

        SetUniqueWords setUniqueWords = new SetUniqueWords();

        setUniqueWords.addWord(uniqueWords.getUniqueWord());

        setUniqueWords.checkWord(uniqueWords.getUniqueWord());

        System.out.println(" ");
        setUniqueWords.displayUniqueWords();
    }
}
