package collections.set_interfaces.BasicOperationsWithSet.UniqueWords.uniqueWords;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class SetUniqueWords {

    private static final Logger logger = Logger.getLogger(SetUniqueWords.class.getName());
    private Set<UniqueWords> uniqueWords = new HashSet<>();

    public void addWord (String word) {
        logger.info(" Adding word '" + word + "' in the list !");
        uniqueWords.add(new UniqueWords(word));
        logger.info("Word '" + word + "' was added to the list");
    }

    public void removeWord (String word) {
        logger.info("Removing word'" + word + "' from the list");
        uniqueWords.removeIf(uniqueWords1 -> uniqueWords1.getUniqueWord().equals(word));
        logger.info("Word'" + word + "' was removed from the list");
    }

    public void checkWord (String word) {
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
            logger.info("Word'" + word + "' is not found in the list");
            System.out.println("Word is not in the list!");
        }
    }

    public void displayUniqueWords () {
        for (UniqueWords value : uniqueWords) {
            System.out.println(value.getUniqueWord());
        }
    }
}
