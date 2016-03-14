package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Michael on 3/8/2016.
 */
public class Game {

	public boolean error;
    public java.util.List<Card> deck = new ArrayList<>();
	
 	public java.util.List<Card> p = new ArrayList<>();
	
	public java.util.List<Card> d = new ArrayList<>();
/*     public Player p = new Player();
    public Dealer d = new Dealer(); */
	
/* 	public Player p;
    public Dealer d;

	public Game(){
		p = new Player();
		d = new Dealer();
		error = false;
	} */
	
    public void buildDeck() {
        for(int i = 2; i < 15; i++){
            deck.add(new Card(i,Suit.Clubs));
            deck.add(new Card(i,Suit.Hearts));
            deck.add(new Card(i,Suit.Diamonds));
            deck.add(new Card(i,Suit.Spades));
        }
    }

    public void shuffle() {
        long seed = System.nanoTime();
        Collections.shuffle(deck, new Random(seed));
    }

    public void dealStartHand(){//give two cards to the player and dealer
        for(int i=0; i<2; i++){
            p.add(deck.get(deck.size()-1));
            deck.remove(deck.size()-1);
            d.add(deck.get(deck.size()-1));
            deck.remove(deck.size()-1);
        }
    }
	
	public void stay(){ // end player turn and hit for dealer
		int total=0;
		Card temp = d.get(0);
		Card temp2 = d.get(1);
		total = temp.getPoint() + temp2.getPoint();
		for(int i=2; i < d.size()+1; i++){			
			if (total < 17){
				d.add(deck.get(deck.size()-1));
				deck.remove(deck.size()-1);
			}
			else{
				break;
				//stay and do nothing
			}
			temp = d.get(i);
			total += temp.getPoint();
		}

	}






}
