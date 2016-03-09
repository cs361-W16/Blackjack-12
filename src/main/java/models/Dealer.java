package models;

/**
 * Created by Michael on 3/8/2016.
 */
public class Dealer extends PersonAbstract {
    public Dealer(){
        //dealer has unlimited money?
        this.bust = 0; //by default the dealer has not busted
    }
}
