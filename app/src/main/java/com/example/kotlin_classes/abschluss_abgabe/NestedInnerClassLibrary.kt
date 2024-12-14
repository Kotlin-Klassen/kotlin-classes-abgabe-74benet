package com.example.kotlin_classes.abschluss_abgabe

class Library {
    private val books = mutableListOf<Book>()

    class LibraryAddress(
        private val street: String,
        private val city: String,
        private val zipCode: String
    ) {
        fun printAddress() {
            println("Adresse: $street, $zipCode $city")
        }
    }

    inner class LibraryMember(val name: String, val memberID: String) {
        fun checkoutBook(book: Book, dueDate: String) {
            book.status = BookStatus.CheckedOut(dueDate)
        }

        fun reserveBook(book: Book) {
            book.status = BookStatus.Reserved(name)
        }
    }

    fun addBook(book: Book) {
        books.add(book)
    }

    fun findBooksByTitle(title: String): List<Book> {
        return books.filter { it.title.contains(title, ignoreCase = true) }
    }

    fun findBooksByAuthor(author: String): List<Book> {
        return books.filter { it.author.contains(author, ignoreCase = true) }
    }

    fun printAllBookStatuses() {
        for (book in books) {
            println("${book.title} (${book.author}) - Status: ${book.status.printStatus()}")
        }
    }
}