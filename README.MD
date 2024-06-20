# Basic operations with Set

## 1. set of guests DONE

- Create a class called "``GuestSet`` that has a set of objects of type "Guest" as an attribute. Each guest has attributes such as name and invitation code. Implement the following methods:

    - ``addGuest(String name, int InvitationCode)``: Adds a guest to the set.

    - ``RemoveGuestByInvitationCode(int InvitationCode)``: Removes a guest from the set based on the invitation code.

    - ``countGuests()``: Counts the total number of guests in the set.

    - ``displayGuests()``: Displays all the guests in the set.

## 2. set of unique words DONE

- Create a class called "``SetUniqueWords`` that has a set of unique words as an attribute. Implement the following methods:

    - ``addWord(String word)``: Adds a word to the set.

    - ``removeWord(String word)``: Removes a word from the set.

    - ``checkWord(String word)``: Checks if a word is present in the set.

    - ``displayUniqueWords()``: Displays all the unique words in the set.

# Search in Set

## 1. address book

- Create a class called ``AgendaContacts"`` which has a set of objects of type "Contact" as an attribute. Each contact has attributes such as name and phone number. Implement the following methods:

    - ``addContact(String name, int number)``: Adds a contact to the address book

    - ``displayContacts()``: Displays all the contacts in the address book.

    - ``searchByName(String name)``: - Searches for contacts by name and returns a set with the contacts found.

    - ``updateContactNumber(String name, int newNumber)``: Updates the phone number of a specific contact.

## 2. list of tasks

- Create a class called "``TaskList`` that has a set of objects of type "Task" as an attribute. Each task has a description attribute and a boolean attribute to indicate whether the task has been completed or not. Implement the following methods:

    - ``addTask(String description)``: Adds a new task to the Set.

    - ``removeTask(String description)``: Removes a task from the Set according to its description, if present.

    - ``displayTasks()``: Displays all the tasks in the task list.

    - ``countTasks()``: Counts the total number of tasks in the task list.

    - ``getCompletedTasks()``: Returns a set with the completed tasks.

    - ``getPendingTasks()``: Returns a set of pending tasks.

    - ``markTaskCompleted(String description)``: Marks a task as completed according to its description.

    - ``markTaskPending(String description)``: Marks a task as pending according to the description.

    - clearTaskList(): Removes all tasks from the task list.

# Sorting in Set

## 1. Product Registration

- Create a class called "``ProductCatalog`` that has a set of objects of type "``Product`` as an attribute. Each product has attributes such as ``name``, ``code``, ``price`` and ``quantity``. Implement the following methods:

    - ``addProduct(long cod, String name, double price, int quantity)``: Adds a product to the register.

    - ``displayProductsByName()``: Displays all the products in the register in alphabetical order by name.

    - ``displayProductsByPrice()``: Displays all the products in the register in ascending order of price.

## 2. list of students

- Create a class called ``StudentManager`` that will handle a list of students. Each student will have attributes such as ``name``, ``enrollment`` and ``note``. We will implement the following methods:

    - ``addStudent(String name, Long enrollment, double average)``: Adds a student to the set.

    - ``removeStudent(long enrollment)``: Removes a student from the set starting from the enrollment, if present.

    - ``displayStudentsByName()``: Displays all the students in the set in alphabetical order by name.

    - ``displayStudentsByGrade()``: Displays all the students in the set in ascending grade order.

    - ``displayStudents()``: Displays all the students in the set.
