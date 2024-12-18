package com.example.kotlin_classes.abschluss_abgabe

enum class Genre(val description: String) {
    FICTION("Fictional stories and novels"),
    NON_FICTION("Factual and real-world topics"),
    SCIENCE("Scientific literature and research"),
    HISTORY("Historical accounts and biographies"),
    CHILDREN("Books for children");

    fun printDescription() {
        println(description)
    }
}