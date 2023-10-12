package week06codingproject;

import java.util.*;

public class Player {
	// Fields: hand, score, name
	// Methods: describe, flip, draw, incrementScore
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	public Player() {}
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	
	public void describe() {
		 System.out.println("This player's name is: " + this.getName());
		 System.out.println("Their score is: " + this.getScore());
		 for (Card c : hand) {
			 c.describe();
		 }
	}
	
	public Card flip() {
		Card flippedCard = this.hand.remove(0);
		return flippedCard;
		}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		int tempScore = this.getScore();
		tempScore++;
		this.setScore(tempScore);
	}
		
}
