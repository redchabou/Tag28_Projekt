fun main() {
    val pages = listOf(Page("Das ist der Anfang des Buches."),
        Page("Jetzt sind wir auf Seite 2."),
        Page("Jetzt sind wir auf Seite 3."),
        Page("Jetzt sind wir auf Seite 4."),
        Page("Jetzt sind wir auf Seite 5."),
        Page("Jetzt sind wir auf Seite 6."),
        Page("Jetzt sind wir auf Seite 7."),
        Page("Jetzt sind wir auf Seite 8."),
        Page("Jetzt sind wir auf Seite 9."),
        Page("Jetzt sind wir auf Seite 10."),
        Page("Jetzt sind wir auf Seite 11."),
        Page("Hier haben wir gerade Seite 12 erreicht."),
        Page("Nun sind wir bei der letzten Seite angekommen."))
    val book = Book(pages)

    book.page = pages[0]
    book.read() // prints esrte Seite des Buches."
    book.nextPage()
    book.read() // prints Seite 2
    book.nextPage()
    book.read() // prints Seite 3
    book.nextPage()
    book.read() // prints Seite 4
    book.nextPage()
    book.read() // prints Seite 5
    book.nextPage()
    book.read() // prints Seite 6
    book.nextPage()
    book.read() // prints Seite 7
    book.nextPage()
    book.read() // prints Seite 8
    book.nextPage()
    book.read() // prints Seite 9
    book.nextPage()
    book.read() // prints Seite 10
    book.nextPage()
    book.read() // prints Seite 11
    book.nextPage()
    book.read() // prints Seite 12
    book.nextPage()
    book.read() // prints letzte Site des Buches.


    book.page = pages[pages.size -1]
    while (book.page != pages[0]) {
        book.previousPage()
        book.read()
    }
}