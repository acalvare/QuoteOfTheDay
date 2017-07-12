package qotd

import grails.test.mixin.TestFor
import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
@TestFor(QuoteService)
class QuoteControllerIntegrationSpec extends Specification {

    void "When you insert a quote into the database and then call the random quote it will return the new quotes and not the default quote"() {
        given: "A new quote"
        Quote quote = new Quote(author: 'Alex', content: 'This is a new quote')

        when: "We save the quote and then retrieve a random quote"
        quote.save()
        Quote quoteFromDb = service.getRandomQuote()

        then: "The quote we pulled from the db will be the same quote we saved"
        quote.errors.errorCount == 0
        quoteFromDb == quote
    }
}
