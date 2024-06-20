package collections.lists.basicsOperations.taskList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task {
    private final List<String> descriptionTask = new ArrayList<>();

    public void addTask(String description) {
        descriptionTask.add(description);
    }

    public void removeTask(String description) {
        /*Iterator to loop in the list*/
        Iterator<String> stringIterator = descriptionTask.iterator();

        /*while have elements in the list to do loop*/
        while (stringIterator.hasNext()) {

            /*Get each element in the loop and save*/
            String taskDescription = stringIterator.next();

            if (taskDescription.equals(description)) {
                /*remove currently description*/
                stringIterator.remove();

                break; // Remove only the first matching task
            }

        }

    }

    public void getTotalNumberTasks() {
        System.out.println("Number of Tasks: " + descriptionTask.size());
    }

    public void getDescriptionTask() {
        for (String descriptionList : descriptionTask) {
            System.out.println(descriptionList);
        }
    }

}
