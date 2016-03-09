package models;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by Michael on 3/8/2016.
 */
public class playerTest {
    @Test
    public void testPlayerCreation(){
        player p = new player();
        assertNotNull(p);
        assertEquals(p.getMoney(),100);
    }

    @Test
    public void winBet(){
        int bet = 50;
        player p = new player();
        p.setMoney(bet);
        assertEquals(p.getMoney(),150);
    }

    @Test
    public void setHand(){
        Card c = new Card(10,Suit.Clubs);
        player p = new player();
        p.setHand(c);
        assertEquals(p.getHand(0).getSuit(),Suit.Clubs);

    }
}
