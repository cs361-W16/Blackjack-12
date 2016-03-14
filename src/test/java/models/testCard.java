package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Michael on 3/7/2016.
 */
public class testCard{
    @Test
    public void testGetSuit(){
    Card c = new Card(5,Suit.Clubs);
    assertEquals(Suit.Clubs,c.getSuit());
    }

    @Test
    public void testGetPointAce(){
        Card c = new Card(14,Suit.Clubs);
        assertEquals(c.getPoint(),12);
    }

    @Test
    public void testGetPoint(){
        Card c = new Card(12,Suit.Clubs);
        assertEquals(c.getPoint(),10);
    }

    @Test
    public void testToString(){
        Card c = new Card(5,Suit.Clubs);
        assertEquals("5Clubs",c.toString());
    }

    @Test
    public void testGetValue(){
        Card c = new Card(5,Suit.Clubs);
        assertEquals(c.getValue(),5);
    }
}
