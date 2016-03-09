package models;

import java.util.ArrayList;

/**
 * Created by Michael on 3/8/2016.
 */
public abstract class PersonAbstract {

    public int money;

    public java.util.List<Card> hand = new ArrayList<>();

    public void setMoney(int add){
        this.money = money + add;
    }

    public int getMoney(){
        return this.money;
    }

    public void setHand(Card c){
        hand.add(c);
    }

    public Card getHand(int x){
        return hand.get(x);
    }
}
