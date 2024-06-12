package collections.lists.basicsOperations.taskList;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private final List<String> descriptionTask = new ArrayList<>();

    public void addTask(String description) {
        descriptionTask.add(description);
    }

    public void removeTasks(String description) {
        descriptionTask.remove(description);
    }

    public void getDescriptionTask() {
       for (String descriptionList: descriptionTask) {
           System.out.println(descriptionList);
       }
    }


}
