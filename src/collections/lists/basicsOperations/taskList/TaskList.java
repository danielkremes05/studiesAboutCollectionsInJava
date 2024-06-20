package collections.lists.basicsOperations.taskList;

public class TaskList {
    public static void main(String[] args) {
        Task task = new Task();

        System.out.println("Before Remove: ");
        task.addTask("Sleep tomorrow");
        task.getDescriptionTask();
        System.out.println();

        System.out.println("After remove: ");
        task.removeTask("Sleep Tomorrow");
        task.getDescriptionTask();
        System.out.println();

        System.out.println("Again: ");
        task.addTask("Sleep tomorrow");
        task.getDescriptionTask();

        task.getTotalNumberTasks();

    }

}
