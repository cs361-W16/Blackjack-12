package models;

import java.util.ArrayList;

/**
 * Created by Michael on 3/8/2016.
 */
public class player {

    public int money;

    public java.util.List<Card> hand = new ArrayList<>();

    public player(){
        this.money = 100;
    }

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
