package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by Michael on 3/7/2016.
 */
public class Card implements Serializable {
    public final int value;
    public final Suit suit;
    public final int point;

    @JsonCreator
    public Card(@JsonProperty("value") int value, @JsonProperty("suit") Suit suit) {
        this.value = value;
        this.suit = suit;

        if(this.value > 10 && this.value != 14) {
            this.point = 10;
        }
        else if(this.value == 14){
            this.point = 12;
        }
        else {
            this.point = this.value;
        } 
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

     public int getPoint(){
        return point;
    } 

    public String toString() {
        return this.value + this.suit.toString();
    }

}
