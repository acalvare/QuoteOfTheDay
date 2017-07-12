package qotd

class QuoteController {
    QuoteService quoteService
    static scaffold = Quote

    def index() { }

    def random(){
        Quote randomQuote = quoteService.getRandomQuote()
        return ["quote" : randomQuote]
    }
}
