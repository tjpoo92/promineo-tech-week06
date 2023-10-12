package week06codingproject;

import java.util.*;

public class Deck {
	// Fields: cards
	// Methods: shuffle, draw
	List<Card> cards = new ArrayList<Card>();
	String[] card = {"Two", "Three", "Four", "Five", "Six", "Seven",
			"Eight","Nine","Ten","Jack","Queen","King","Ace"};
	String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		
	public Deck() {
		for (String s : suits) {
			int tempValue = 2;
			for (String c: card) {
				Card tempCard = new Card(c,s,tempValue);
				cards.add(tempCard);
				tempValue++;
			}
		}
	}
		
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}
	
}
