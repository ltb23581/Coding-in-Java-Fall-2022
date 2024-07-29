import java.util.Scanner;

public class ParseTheTweet {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String message;
		String typ;
		String det;
		String loc;
		String lat;
		String lng;
		char semi = ';';
		char tag = '#';

		System.out.println("Enter a tweet below");
		message = keyboard.nextLine();

		typ = message.substring(message.indexOf(tag) + 5, message.indexOf(semi)).trim().toUpperCase();
		message = message.substring(message.indexOf(semi) + 1).trim();

		System.out.print("Type:\t\t");
		System.out.println(typ);

		det = message.substring(message.indexOf(tag) + 5, message.indexOf(semi)).trim();
		message = message.substring(message.indexOf(semi) + 1).trim();

		System.out.print("Detail:\t\t");
		System.out.println(det);

		loc = message.substring(message.indexOf(tag) + 5, message.indexOf(semi)).replace(',', '-').trim();
		message = message.substring(message.indexOf(semi) + 1).trim();

		System.out.print("Location:\t");
		System.out.println(loc);

		lat = message.substring(message.indexOf(tag) + 5, message.indexOf(semi)).trim();
		message = message.substring(message.indexOf(semi) + 1).trim();

		System.out.print("Latitude:\t");
		System.out.println(lat);

		lng = message.substring(message.indexOf(tag) + 5, message.indexOf(semi)).trim();
		message = message.substring(message.indexOf(semi) + 1).trim();

		System.out.print("Longitude:\t");
		System.out.println(lng);

		keyboard.close();

	}
}