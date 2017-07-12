package qotd

class QuoteController {
    QuoteService quoteService
    static scaffold = Quote.class
    static defaultAction = "random"

    def random(){
        Quote randomQuote = quoteService.getRandomQuote()
        return ["quote" : randomQuote]
    }
}
