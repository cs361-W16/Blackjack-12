package models;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by Michael on 3/8/2016.
 */
public class testGame {
    @Test
    public void testGameCreation(){
        Game g = new Game();
        assertNotNull(g);
    }

    @Test
    public void testGameBuildDeck() {
        Game g = new Game();
        g.buildDeck();
        assertEquals(52, g.deck.size());
    }
}
