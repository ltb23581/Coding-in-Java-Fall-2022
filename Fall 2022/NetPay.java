import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int hours_per_week;
		float gross_pay, netPay, federal, state, social_security, medicare;
		final float FEDERAL_TAX_PERCENT, STATE_TAX_PERCENT, SOCIAL_SECURITY_PERCENT, MEDICARE_PERCENT, PAY_PER_HOUR;

		FEDERAL_TAX_PERCENT = 10;
		STATE_TAX_PERCENT = 4.5f;
		SOCIAL_SECURITY_PERCENT = 6.2f;
		MEDICARE_PERCENT = 1.45f;
		PAY_PER_HOUR = 7.25f;

		System.out.print("Hours per Week:");
		System.out.print("\t\t");
		hours_per_week = keyboard.nextInt();

		gross_pay = hours_per_week * PAY_PER_HOUR;
		federal = gross_pay * FEDERAL_TAX_PERCENT / 100;
		state = gross_pay * STATE_TAX_PERCENT / 100;
		social_security = gross_pay * SOCIAL_SECURITY_PERCENT / 100;
		medicare = gross_pay * MEDICARE_PERCENT / 100;
		netPay = gross_pay - (federal + state + social_security + medicare);

		System.out.print("Gross Pay:");
		System.out.println("\t" + "\t" + gross_pay);

		System.out.print("Net Pay:");
		System.out.println("\t" + "\t" + netPay);

		System.out.println();
		System.out.println("Deductions");

		System.out.print("Federal:");
		System.out.println("\t" + "\t" + federal);

		System.out.print("State:");
		System.out.println("\t" + "\t" + "\t" + state);

		System.out.print("Social Security:");
		System.out.println("\t" + social_security);

		System.out.print("Medicare:");
		System.out.println("\t" + "\t" + medicare);

		keyboard.close();
	}
}
