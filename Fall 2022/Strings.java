import java.util.Scanner;

public class StringFun {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String message, command, changedMessage; // initializes strings
		char characterOne, characterTwo; // initializes char
		int j, position, position2; // initializes int
		boolean exist; // initializes boolean

		System.out.println("Enter the string to be manipulated");
		message = keyboard.nextLine(); // user inputs the string they want to alter
		System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
		command = keyboard.nextLine(); // user chooses how they want to manipulate the string

		while (command.equalsIgnoreCase("quit") == false) { // while the input is anything but "quit", the program will
															// continue and
			changedMessage = ""; // re-ask the user to input a command

			// reverse
			if (command.equalsIgnoreCase("reverse")) {
				for (int i = message.length() - 1; i >= 0; i--) { // reverses the order of the string
					changedMessage = changedMessage + message.charAt(i);
				}
				message = changedMessage.trim();
				System.out.println("The new sentence is: " + message); // outputs the new string

				// replace first
			} else if (command.equalsIgnoreCase("replace first")) {
				j = 0;
				System.out.println("Enter the character to replace");
				characterOne = keyboard.next().charAt(0);
				System.out.println("Enter the new character");
				characterTwo = keyboard.next().charAt(0);
				// looks for the first instance of the character to replace, and makes sure that
				// j won't go out of bound
				while (message.charAt(j) != characterOne && j <= message.length() - 2) {
					j++;
				}
				// checks if j goes out of bound, if it does that means the letter was not found
				if (j + 2 > message.length()) {
					System.out.println("The letter was not found in the word");
					changedMessage = keyboard.nextLine();
				} else {
					// creates a string that contains the letters before the character that needs to
					// be replaced
					for (int i = 0; i < j; i++) {
						changedMessage = changedMessage + message.charAt(i);
					}
					// adds the new character where the old character use to be
					changedMessage = changedMessage + characterTwo;
					// finishes off the the string with the characters after the replaced character
					for (int i = j + 1; i < message.length(); i++) {
						changedMessage = changedMessage + message.charAt(i);
					}
					message = changedMessage.trim();
					System.out.println("The new sentence is: " + message); // outputs new string
					changedMessage = keyboard.nextLine();
				}

				// replace last
			} else if (command.equalsIgnoreCase("replace last")) {
				j = message.length() - 1;
				System.out.println("Enter the character to replace");
				characterOne = keyboard.next().charAt(0);
				System.out.println("Enter the new character");
				characterTwo = keyboard.next().charAt(0);
				// looks for last instance of the character by starting the search at the end of
				// the string, and looking the the
				// first instance. This also makes sure j wont go out of bound
				while (message.charAt(j) != characterOne && j > 0) {
					j--;
				}
				// if j goes below zero then that means j went out of bounds
				if (j < 0) {
					System.out.println("The letter was not found in the word");
				} else {
					// creates a string that contains the letters before the character that needs to
					// be replaced
					for (int i = 0; i < j; i++) {
						changedMessage = changedMessage + message.charAt(i);
					}
					// adds the new character where the old character use to be
					changedMessage = changedMessage + characterTwo;
					// finishes off the the string with the characters after the replaced character
					for (int i = j + 1; i < message.length(); i++) {
						changedMessage = changedMessage + message.charAt(i);
					}
					message = changedMessage.trim();
					System.out.println("The new sentence is: " + message);
					changedMessage = keyboard.nextLine();
				}

				// remove all
			} else if (command.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				characterOne = keyboard.next().charAt(0); // user input
				j = 0;
				// creates the string without the user inputted in it
				for (int i = 0; i < message.length(); i++) {
					// if the character is not in that position the add that character to the string
					// if it is don't add anything to
					// the string
					if (message.charAt(i) != characterOne) {
						changedMessage = changedMessage + message.charAt(i);
						// this will tell us if the character was ever detected in the string
					} else {
						j++;
					}
				}
				// if the letter did exist in the string then print the string with the removed
				// character
				if (j > 0) {
					message = changedMessage.trim();
					System.out.println("The new sentence is: " + message);
					changedMessage = keyboard.nextLine();
					// if the character never existed in the string then it will print that
				} else {
					System.out.println("Error: the letter you are trying to remove does not exist");
					changedMessage = keyboard.nextLine();
				}
				// remove
			} else if (command.equalsIgnoreCase("remove")) {
				position = 0;
				position2 = 0;
				j = 0;
				exist = false;
				System.out.println("Enter the character to remove");
				characterOne = keyboard.next().charAt(0);
				System.out.println("Enter the " + characterOne
						+ " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.): ");
				position = keyboard.nextInt();
				// searches the whole string for any instances of the character
				for (int i = 0; i < message.length(); i++) {
					// if the character is found increment j
					if (message.charAt(i) == characterOne) {
						j++;
						// if the 'n'th instance of the character found it will save it and say that it
						// exist
						if (j == position) {
							position2 = i;
							exist = true;
						}
					}
				}
				// if the character exist it will create a new string without the character
				if (exist == true) {
					for (int i = 0; i < message.length(); i++) {
						// once the i equals the position where the character that needs to be remove it
						// wont add that character to
						// the string
						if (i == position2) {

						} else {
							changedMessage = changedMessage + message.charAt(i);
						}
					}
					message = changedMessage.trim();
					System.out.println("The new sentence is: " + message);
					// if the character does not exist then it will print this
				} else {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				changedMessage = keyboard.nextLine();
			}else {
				System.out.println("Command Invalid. Try again");
			}
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = keyboard.nextLine();
		}
		keyboard.close();
	}
}