import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in); // starts scanner

		String move, message; // initializes string
		int points, score1, score2; // initializes integers -- score1: computer; score2: user
		score1 = 0; // declares value for score1
		score2 = 0; // declares value for score2

		System.out.print("Points to win: "); // asks for points it takes to win
		points = keyboard.nextInt(); // user inputs points

		if (points < 1) { // it is assumed that the user enters a number greater than 1, but in the case
							// the user does not, the code will exit
			System.exit(0);
		}

		keyboard.nextLine();

		while (score1 < points && score2 < points) {
			/*
			 * loop that declares winner: while the computer or users' score is less than
			 * the total points needed to win, the code repeat until either score is equal
			 * to points; thus, ending the loop indicating someone has won
			 */
			do {
				/*
				 * do-while loop will repeat while users' input is not rock paper and scissors
				 */
				System.out.print("Rock, paper, or scissors? ");
				move = keyboard.nextLine().toLowerCase();

			} while (move.equals("rock") == false && move.equals("paper") == false && move.equals("scissors") == false);

			String computerMove = ComputerOpponent.getMove();
			/*
			 * comparing users' move to computers' move to find winner add point to score
			 * for winner
			 */
			if (move.equals("rock")) {
				if (computerMove.equals("rock")) {
					message = "so it's a tie.";
				} else if (computerMove.equals("paper")) {
					message = "so you lose.";
					score1++;
				} else {
					message = "so you win.";
					score2++;
				}
			} else if (move.equals("paper")) {
				if (computerMove.equals("paper")) {
					message = "so it's a tie.";
				} else if (computerMove.equals("scissors")) {
					message = "so you lose.";
					score1++;
				} else {
					message = "so you win.";
					score2++;
				}
			} else {
				if (computerMove.equals("scissors")) {
					message = "so it's a tie.";
				} else if (computerMove.equals("paper")) {
					message = "so you win.";
					score2++;
				} else {
					message = "so you lose.";
					score1++;
				}
			}
			System.out.println(", " + message + " (" + score2 + "-" + score1 + ")");
			/*
			 * prints match outcome
			 */
		}
		if (score1 > score2) {
			/*
			 * determines if user wins or loses
			 */
			System.out.print("Sorry, you lost. Better luck next time!");
		} else {
			System.out.print("Congratulations! You won!");
		}

		keyboard.close();

	}
}
