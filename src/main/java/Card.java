public class Card {

    public static enum Suit {
        HEARTS,
        DIAMONDS,
        CLUBS,
        SPADES;

        private static Suit[] vals = values();

        public Suit next() {
            return vals[this.ordinal() + 1 % vals.length];
        }

        public Suit prev() {
            return vals[this.ordinal() - 1 % vals.length];
        }
    }

    public static enum Value {
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING;

        private static Value[] vals = values();

        public Value next() {
            return vals[(this.ordinal() + 1) % vals.length];
        }

        public Value prev() {
            int mod = this.ordinal() - 1 % vals.length;
            if (mod < 0) {
                mod += vals.length;
            }
            return vals[mod];
        }
    }

    private Suit suit;
    private Value value;

    public Suit getSuit() {
        return suit;
    }
    public Value getValue() {
        return value;
    }

    public Card(Value value, Suit suit) {
        this.suit = suit;
        this.value = value;
    }

    /**
     * returns whether a card is actually
     * @param other
     * @return
     */
    public boolean isAdjacent(Card other) {
        return this.value.next().equals(other.value) ||
                this.value.prev().equals(other.value) ||
                this.value.equals(other.value);
    }

    public Value[] getAdjacentValues() {
        return new Value[] { this.value.prev(), this.value, this.value.next() };
    }

    public String toString() {
        return "Card: " + this.value.name() + " of " + this.suit.name();
    }
}
