Exercises:

1. Basic operations with Map
2. Searching in Map
3. Sorting in Maps

## Basic Map Operations

### 1. Address Book STATUS OK

<p>
Create a class called "AgendaContacts" that uses a Map to store the contacts. Each contact has a name as a key and a phone number as a value. Implement the following methods:

- `addContact(String name, Integer phone)`: Adds a contact to the address book, associating the contact's name with the corresponding phone number.
- `removeContact(String name)`: Removes a contact from the address book, given the contact's name.
- `displayContacts()`: Displays all the contacts in the address book, showing the name and phone number of each contact.
- `searchByName(String name)`: Searches for a contact by name and returns the corresponding phone number.
</p>

### 2 Dictionary

<p>
Create a class called "Dictionary" that uses a Map to store words and their respective definitions. Implement the following methods:

- `addWord(String word, String definition)`: Adds a word and its definition to the dictionary, associating the word with its corresponding definition.
- `removeWord(String word)`: Removes a word from the dictionary, given the term to be removed.
- `displayWords()`: Displays all the words and their definitions in the dictionary, showing each word followed by its definition.
- `searchForWord(String word)`: Searches for a word in the dictionary and returns its corresponding definition.
</p>

---

## Search in Map

### 1. stock of products with price

<p>
Create a class called "StockProducts" that uses a Map to store the products, 
their quantities in stock and their respective prices. 
Each product has a code as its key and a Product object as its value, 
containing its name, quantity and price. Implement the following methods:

- `addProduct(long cod, String name, int quantity, double price)`: Adds a product to stock, along with the quantity available and the price.
- `displayProducts()`: Displays all products, their stock quantities and prices.
- `calculateTotalStockValue()`: Calculates and returns the total stock value, taking into account the quantity and price of each product.
- `getMostExpensiveProduct()`: Returns the most expensive product in stock, i.e. the one with the highest price.
- `obterProductMostExpensive()`: Returns the cheapest product in stock, i.e. the one with the lowest price.
- `obtainMostQuantityProductTotalValueInStock()`: Returns the product with the largest quantity in stock, considering the total value of each product (quantity * price).
</p>

### 2. word count

<p>
Create a class called "WordCount" that uses a Map to store the words and the number of times each word appears in a text. Implement the following methods:

- `addWord(String word, Integer count)`: Adds a word to the count.
- `removeWord(String word)`: Removes a word from the count, if present.
- `displayWordCount()`: Displays all words and their respective counts.
- `findMostFrequentWord()`: Finds the most frequent word in the text and returns the word and its count.
</p>

---

## Sorting in Maps

### 1. Calendar of Events STATUS OK

<p>
Create a class called "Calendar Events" that uses a `Map` to store the dates and their respective Events. Each event is represented by an object of the "Event" class, which has attributes such as the name of the event and the name of the attraction. Implement the following methods:

- `addEvent(LocalDate date, String name, String attraction)`: Adds an event to the agenda.
- `displayAgenda()`: Displays the events agenda in ascending date order.
- `getNextEvent()`: Returns the next event that will take place.
</p>

### 2. online bookshop

<p>
Create a class called "BookstoreOnline" that represents an online bookstore. This class uses a Map to store the books available in the bookstore, using the link of the work in the Amazon Marketplace as the key and an object of the "Book" class as the value. The "Book" class has attributes such as title, author and price. Through the "LivrariaOnline" class, implement the following methods:

- `addBook(String link, String title, String author, private double price)`: Adds a book to the bookstore, using the ISBN as the key in Map.
- `removeBook(String title)`: Removes a book from the bookstore, given the title of the book.
- `displayBooksOrderedByPrice()`: Displays the books in the bookstore in ascending order of price.
- `searchBooksByAuthor(String author)`: Returns a list of all the books written by a given author.
- `getMostExpensiveBook()`: Returns the most expensive book available in the bookstore.
- `displayBestBook()`: Returns the cheapest book available in the bookstore.
</p>
