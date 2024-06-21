package collections.set_interfaces.basicOperationsWithSet.UniqueWords.main;

import collections.set_interfaces.basicOperationsWithSet.UniqueWords.uniqueWords.SetUniqueWords;
import collections.set_interfaces.basicOperationsWithSet.UniqueWords.uniqueWords.UniqueWords;
import collections.set_interfaces.basicOperationsWithSet.UniqueWords.uniqueWords.UniqueWordsBuilder;

/**
 * Main class to demonstrate usage of UniqueWords, UniqueWordsBuilder, and SetUniqueWords classes.
 */
public class Main {
    public static void main(String[] args) {

        // Create a UniqueWords object using UniqueWordsBuilder
        UniqueWords uniqueWords = new UniqueWordsBuilder()
                .uniqueWord("Teste")
                .uniqueWordBuilder();

        // Create a SetUniqueWords instance
        SetUniqueWords setUniqueWords = new SetUniqueWords();

        // Add the unique word to setUniqueWords
        setUniqueWords.addWord(uniqueWords.getUniqueWord());

        // Check if the unique word exists in setUniqueWords
        setUniqueWords.checkWord(uniqueWords.getUniqueWord());

        // Display the unique words in setUniqueWords
        System.out.println("Unique Words:");
        setUniqueWords.displayUniqueWords();
    }
}
