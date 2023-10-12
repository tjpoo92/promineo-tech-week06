package week06codingproject;

public class Card {
	// Fields: value, name
	// Methods: getters, setters, describe
	
	String name;
	String suit;
	int value;
	
	public Card() {}
	
	public Card(String name, String suit, int value) {
		this.name = name + " of " + suit;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public void describe() {
		System.out.println(this.name + " has a value of " + this.value);
	}
}
