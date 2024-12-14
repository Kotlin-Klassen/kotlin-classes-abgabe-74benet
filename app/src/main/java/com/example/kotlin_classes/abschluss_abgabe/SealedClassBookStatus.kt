package com.example.kotlin_classes.abschluss_abgabe

sealed class BookStatus {
    object Available : BookStatus()
    data class CheckedOut(val dueDate: String) : BookStatus()
    data class Reserved(val reservedBy: String) : BookStatus()

    fun printStatus(): String {
        return when (this) {
            is Available -> "Verfügbar"
            is CheckedOut -> "Ausgeliehen bis $dueDate"
            is Reserved -> "Reserviert von $reservedBy"
        }
    }
}