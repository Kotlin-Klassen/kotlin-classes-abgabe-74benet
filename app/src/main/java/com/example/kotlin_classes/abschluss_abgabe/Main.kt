package com.example.kotlin_classes.abschluss_abgabe

fun main() {
    val library = Library()
    val address = Library.LibraryAddress("Musterstraße 1", "Musterstadt", "12345")

    library.addBook(Book("Der Hobbit", "J.R.R. Tolkien", Genre.FICTION, BookStatus.Available))
    library.addBook(Book("Eine kurze Geschichte der Zeit", "Stephen Hawking", Genre.SCIENCE, BookStatus.Available))
    library.addBook(Book("Wilde Schwäne", "Jung Chang", Genre.HISTORY, BookStatus.Available))

    address.printAddress()

    val member = library.LibraryMember("Alice", "ID001")
    val hobbitBook = library.findBooksByTitle("der hobbit").firstOrNull()
    val scienceBook = library.findBooksByAuthor("Stephen Hawking").firstOrNull()

    hobbitBook?.let { member.checkoutBook(it, "31.12.2024") }
    scienceBook?.let { member.reserveBook(it) }

    library.printAllBookStatuses()
}