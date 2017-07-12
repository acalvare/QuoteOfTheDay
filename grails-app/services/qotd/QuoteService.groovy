package qotd

import grails.transaction.Transactional

@Transactional
class QuoteService {

    def getRandomQuote() {
        List<Quote> quotes = Quote.getAll()
        if(quotes.size() > 0) {
            int randomIndex = new Random().nextInt(quotes.size())
            return quotes.get(randomIndex)
        } else {
            return new Quote(author: 'Darth Vader', content: 'Luke, I am your father')
        }
    }
}
