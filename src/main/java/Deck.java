import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    /**
     * creates a new deck with 52 cards, then shuffles it
     */
    public Deck() {
        this.cards = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Value value : Card.Value.values()) {
                this.cards.add(new Card(value, suit));
            }
        }

        Collections.shuffle(this.cards);
    }

    /**
     * A constructor that takes a list of cards, creates a deck of those cards
     * this is meant to be used to construct a player's hand
     * @param cards - the list of cards to make a deck with
     */
    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    /**
     * adds a list of cards to a deck
     * @param cards - the cards to add to the deck
     */
    public void addCards(List<Card> cards) {
        this.cards.addAll(cards);
    }

    /**
     * adds a single card to the deck
     * @param card - the card to add
     */
    public void addCard(Card card) {
        this.cards.add(card);
    }

    /**
     * removes all cards in a list from the deck
     * @param cards - the cards to be removed
     */
    public void removeCards(List<Card> cards) {
        this.cards.removeAll(cards);
    }

    public List<Card> getCards() {
        return this.cards;
    }

    /**
     * removes cards from the top of the deck to deal
     * @param numberToDeal - the number of cards to remove and deal
     * @return - the list of cards dealt
     */
    public List<Card> dealCards(int numberToDeal) {
        if(numberToDeal > this.cards.size()) {
            throw new IllegalArgumentException("");
        }
        List<Card> dealtCards = new ArrayList<>();
        for(int i = 0; i < numberToDeal; i++) {
            dealtCards.add(this.cards.remove(0));
        }
        return dealtCards;
    }
}
