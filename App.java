package week06codingproject;

public class App {

	public static void main(String[] args) {
		// Automated version of the card game WAR
		// Instantiate a deck and two players, call the shuffle method on the deck
		// use a traditional for loop, iterate 52 time calling the draw method on the other player each iteration using the instantiated deck
		// use a traditional for loop, iterate 26 times and call the flip method for each player
			// compare the value of each card returned by the two players flip methods call the incrementScore method on the player who card has the higher value.
			// Print a message to say which player received the point, if values are equal print message saying no points were awarded
		// after loop compare final score
		// Print the final score of each player and either Player 1, Player 2, or Draw depending on which score is higher
		Deck deck = new Deck();
		Player player1 = new Player("Billy");
		Player player2 = new Player("Franklin");
		
		deck.shuffle();
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			}
			else {
				player2.draw(deck);
			}
		}
		
		for (int j = 0; j < 26; j++) {
			Card player1Card = player1.flip();
			player1Card.describe();
			Card player2Card = player2.flip();
			player2Card.describe();
			if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
				System.out.println(player1.getName() + " has earned a point!");
			} else if (player2Card.getValue() > player1Card.getValue()) {
				player2.incrementScore();
				System.out.println(player2.getName() + " has earned a point!");
			} else {
				System.out.println("No Point Was Awarded");
			}
		}
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() +  " wins!");
			System.out.println("With a score of: " + player1.getScore());
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println(player2.getName() + " wins!");
			System.out.println("With a score of: " + player2.getScore());
		} else {
			System.out.println("IT'S A TIE!!!");
		}
		
		
	}

}
