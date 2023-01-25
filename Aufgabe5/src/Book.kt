class Book(val pages: List<Page>) {

    var page: Page? = null

    fun read() {
        page?.read()
    }

    fun nextPage() {
        val currentIndex = pages.indexOf(page)
        if (currentIndex != -1 && currentIndex < pages.size - 1) {
            page = pages[currentIndex + 1]
        }
    }

    fun previousPage() {
        val currentIndex = pages.indexOf(page)
        if (currentIndex != -1 && currentIndex > 0) {
            page = pages[currentIndex - 1]
        }
    }
}

class Page(val text: String) {

    fun read() {
        println(text)
    }
}
