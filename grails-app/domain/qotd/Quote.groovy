package qotd

class Quote {
    String author
    String content
    Date addDate


    static constraints = {
        author nullable: false
        content maxSize: 1000, nullable: false
        addDate nullable: true
    }
}
