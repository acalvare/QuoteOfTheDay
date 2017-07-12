package qotd

class Quote {
    String author
    String content


    static constraints = {
        author nullable: false
        content maxSize: 1000, nullable: false
    }
}
