package models;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by Michael on 3/8/2016.
 */
public class testPlayer {
    @Test
    public void testPlayerCreation(){
        Player p = new Player();
        assertNotNull(p);
        assertEquals(p.getMoney(),100);
    }

    @Test
    public void winBet(){
        int bet = 50;
        Player p = new Player();
        p.setMoney(bet);
        assertEquals(p.getMoney(),150);
    }

    @Test
    public void testBust(){
        Player p = new Player();
        p.setBust(1);//bust is true
        assertEquals(p.getBust(),1);
    }

    @Test
    public void setHand(){
        Card c = new Card(10,Suit.Clubs);
        Player p = new Player();
        p.setHand(c);
        assertEquals(p.getHand(0).getSuit(),Suit.Clubs);

    }
}
