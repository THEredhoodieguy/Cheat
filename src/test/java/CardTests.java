import org.junit.*;

import java.util.Arrays;
import java.util.logging.ConsoleHandler;

public class CardTests {

    @Test
    public void CardNameTest() {
        // test to check if toString works properly
        Card aceOfHearts = new Card(Card.Value.ACE, Card.Suit.HEARTS);
        System.out.println(aceOfHearts);
        Assert.assertEquals("Card: ACE of HEARTS", aceOfHearts.toString());
    }

    @Test
    public void CardCompareTest() {
        // test to check if the adjacency check works correctly
        // first check the ordinary values
        for (int i = 1; i <= 11; i ++) {
            Card checkCard = new Card(Card.Value.values()[i], Card.Suit.HEARTS);
            Card lesserCard = new Card(Card.Value.values()[i - 1], Card.Suit.HEARTS);
            Card greaterCard = new Card(Card.Value.values()[i + 1], Card.Suit.HEARTS);
            System.out.println("comparing " + checkCard.toString());
            Assert.assertTrue(checkCard.isAdjacent(lesserCard));
            Assert.assertTrue(checkCard.isAdjacent(checkCard));
            Assert.assertTrue(checkCard.isAdjacent(greaterCard));
        }

        // now check edge cases
        Card ace = new Card(Card.Value.ACE, Card.Suit.HEARTS);
        Card nonAdjacent = new Card(Card.Value.THREE, Card.Suit.HEARTS);
        Card king = new Card(Card.Value.KING, Card.Suit.HEARTS);

        System.out.println("Now checking " + ace.toString());
        System.out.println("Now checking " + king.toString());
        Assert.assertFalse(ace.isAdjacent(nonAdjacent));
        Assert.assertTrue(ace.isAdjacent(king));
        Assert.assertTrue(king.isAdjacent(ace));
    }

    @Test
    public void CardGetAdjacentTest() {
        // test to check if the getAdjacent function works properly
        // first check ordinary values
        for (int i = 1; i <= 11; i++) {
            Card checkCard = new Card(Card.Value.values()[i], Card.Suit.HEARTS);
            Card lesserCard = new Card(Card.Value.values()[i - 1], Card.Suit.HEARTS);
            Card greaterCard = new Card(Card.Value.values()[i + 1], Card.Suit.HEARTS);
            System.out.println("Getting adjacent values for " + checkCard);
            Assert.assertTrue(Arrays.asList(checkCard.getAdjacentValues()).contains(lesserCard.getValue()));
            Assert.assertTrue(Arrays.asList(checkCard.getAdjacentValues()).contains(checkCard.getValue()));
            Assert.assertTrue(Arrays.asList(checkCard.getAdjacentValues()).contains(greaterCard.getValue()));
        }

        // now check edge cases
        Card ace = new Card(Card.Value.ACE, Card.Suit.HEARTS);
        Card nonAdjacent = new Card(Card.Value.THREE, Card.Suit.HEARTS);
        Card king = new Card(Card.Value.KING, Card.Suit.HEARTS);

        System.out.println("Now checking " + ace.toString());
        System.out.println("Now checking " + king.toString());
        Assert.assertTrue(Arrays.asList(ace.getAdjacentValues()).contains(king.getValue()));
        Assert.assertFalse(Arrays.asList(ace.getAdjacentValues()).contains(nonAdjacent.getValue()));
        Assert.assertTrue(Arrays.asList(king.getAdjacentValues()).contains(ace.getValue()));
    }
}
