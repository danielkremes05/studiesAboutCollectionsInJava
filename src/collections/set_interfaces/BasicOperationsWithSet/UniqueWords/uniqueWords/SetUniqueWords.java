package collections.set_interfaces.BasicOperationsWithSet.UniqueWords.uniqueWords;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

/**
 * Manages a set of unique words and provides operations to add, remove, check existence, and display words.
 */
public class SetUniqueWords {

    private static final Logger logger = Logger.getLogger(SetUniqueWords.class.getName());
    private Set<UniqueWords> uniqueWords = new HashSet<>();

    /**
     * Adds a word to the set of unique words.
     * @param word The word to add.
     */
    public void addWord(String word) {
        logger.info("Adding word '" + word + "' to the list");
        uniqueWords.add(new UniqueWords(word));
        logger.info("Word '" + word + "' was added to the list");
    }

    /**
     * Removes a word from the set of unique words.
     * @param word The word to remove.
     */
    public void removeWord(String word) {
        logger.info("Removing word '" + word + "' from the list");
        uniqueWords.removeIf(uniqueWords1 -> uniqueWords1.getUniqueWord().equals(word));
        logger.info("Word '" + word + "' was removed from the list");
    }

    /**
     * Checks if a word exists in the set of unique words.
     * @param word The word to check.
     */
    public void checkWord(String word) {
        boolean found = false;
        for (UniqueWords value : uniqueWords) {
            if (value.getUniqueWord().equals(word)) {
                found = true;
                break;
            }
        }
        if (found) {
            logger.info("Word '" + word + "' is found in the list");
            System.out.println(word + " is in the list");
        } else {
            logger.info("Word '" + word + "' is not found in the list");
            System.out.println("Word is not in the list!");
        }
    }

    /**
     * Displays all unique words in the set.
     */
    public void displayUniqueWords() {
        System.out.println("Unique Words:");
        for (UniqueWords value : uniqueWords) {
            System.out.println(value.getUniqueWord());
        }
    }
}
