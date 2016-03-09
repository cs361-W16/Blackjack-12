package models;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Michael on 3/8/2016.
 */
public class testDealer {
    @Test
    public void testDealerCreate(){
        Dealer d = new Dealer();
        assertNotNull(d);
        assertEquals(d.getBust(),0);
    }
}