# Fixing Knowledge

## Exercises

- 1 Basics operations in lists (DONE)
- 2 Search in lists
- 3 Sorting in lists

## Basics operations in lists

### 1. Task List

Create a class called ``TaskList"`` that has a list of tasks as an attribute

Each task is represented by a class called ``Task`` which has a description attribute. Implement the following methods:

- ``addTask(String description)``: Adds a new task to the list with the given description

- ``removeTask(String description)``: Removes a task from the list based on its description

- ``getTotalNumberTasks()``: Returns the total number of tasks in the list

- ``getTaskDescriptions()``: Returns a list containing the description of all the tasks in the list

### 1. Shopping Cart

Create a class called ``"ShoppingCart"`` that represents an online shopping cart. The cart should be implemented as a list of items. Each item is represented by a class called "Item" which has attributes such as name, price and quantity
Implement the following methods:

- ``addItem(String name, double price, int quantity)``: Adds an item to the cart with the specified name, price and quantity

- ``removeItem(String name)``: Removes an item from the cart based on its name

- ``calculateTotalValue()``: Calculates and returns the total value of the cart, taking into account the price and quantity of each item

- ``displayItems()``: Displays all the items present in the cart, showing their names, prices and quantities

## 2 Search in lists

### 2. Book Catalog

Create a class called``"CatalogoLivros"`` which has a list of objects of type "Livro" as an attribute. Each book has attributes such as title, author and year of publication. Implement the following methods:

- ``addBook(String title, String author, int yearPublication)``: Adds a book to the catalog

- ``searchByAuthor(String author)``: Searches for books by author and returns a list with the books found

- ``searchByYear(int yearStart, int yearEnd)``: Searches for books published in a given range of years and returns a list with the books found

- ``searchByTitle(String title)``: Searches for books by title and returns the first book found

### 2. Sum of Numbers

Create a class called ``"SumNumbers"`` which has a list of integers as an attribute. Implement the following methods:

- ``addNumber(int number)``: Adds a number to the list of numbers

- ``calculateSum()``: Calculates the sum of all the numbers in the list and returns the result

- ``findLargestNumber()``: Finds the largest number in the list and returns the value

- ``findLargestNumber()``: Finds the smallest number in the list and returns the value

- ``displayNumbers()``: Returns a list containing all the numbers in the list

## 3. Sorting in lists

### 3. Sorting People

Create a class called ``"SortPeople"`` which has a list of objects of type ``"Person"`` as an attribute. Each person has attributes such as name, age and height. Implement the following methods:

- ``addPerson(String name, int age, double height)``: Adds a person to the list

- ``sortByAge()``: Sorts the people in the list by age using the Comparable interface

- ``sortByHeight()``: Sorts the people in the list by height using a custom Comparator

### 3. Sorting Numbers

Create a class called "OrdenacaoNumeros" which has a list of integers as an attribute. Implement the following methods:

- ``addNumber(int number)``: Adds a number to the list

- ``sortAscendant()``: Sorts the numbers in the list in ascending order using the Comparable interface and the Collections class

- ``sortDescending()``: Sorts the numbers in the list in descending order using a Comparable and the Collections class

### Last Update: 6/12/2024 4:40 PM
