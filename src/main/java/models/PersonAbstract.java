package models;

import java.util.ArrayList;

/**
 * Created by Michael on 3/8/2016.
 */
public abstract class PersonAbstract {

    public int money;
    public int bust;
    public java.util.List<Card> hand = new ArrayList<>();
    boolean stay;

    public void setMoney(int add){
        this.money = money + add;
    }

    public void setBust(int x){//0 or 1 for bust
       bust = x;
    }

    public int getBust(){
        return this.bust;
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
    public int TotalScore()
    {
        int sumScore = 0;
        int temp_score;
        int ace = 0;
        // Here ace can be a 1 or 11, we will choose by the sum
        // Obvious if the sum is 10 or less you want an 11 since you'll be "closer"
        for (int i = 0; i < hand.size(); i++)
        {
            temp_score = getHand(i).getValue();
            if(temp_score >= 10)
                temp_score = 10;
            else if (temp_score <=9)
                ace++;
            //when 9 + 11 for 20, break when fails
            temp_score = 11;

        }
        if(sumScore > 21)
            for(int i = 0; i<ace; i++)
            {
                temp_score <=10;
                        break;

            }
        return sumScore;



    }

    //hit should go here
    public void hit(ArrayList<Card> deck)
    {
        addHand(deck.get(deck.size()-1));
        deck.remove(deck.size()-1);
        if(TotalScore() > 21) stay();
        // if player is greater than 21, stay





    }
    //stay should be written here
    public void stay()
    {
        stay = true;

    }
}
