import java.lang.Math;
import java.util.Scanner;

public class PayoffDebt {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int months;
		double principal, annual_interest_rates, monthly_payment, total_amount_paid, total_interest_paid, overpayment;
				
		total_amount_paid = 0;
		total_interest_paid = 0;
		overpayment = 0;
		
		System.out.print("Principal:");
		System.out.print("\t"+ "\t"+ "\t");
		principal = keyboard.nextDouble();
		
		System.out.print("Annual Interest Rate (%):");
		System.out.print("\t");
		annual_interest_rates = keyboard.nextDouble();
		
		System.out.print("Monthly Payment:");
		System.out.print("\t"+ "\t");
		monthly_payment = keyboard.nextDouble();
		
		System.out.println();
		
		System.out.print("Months Needed To Pay Off:");
		months = (int)Math.ceil((Math.log(monthly_payment)-(Math.log((monthly_payment)-(annual_interest_rates/1200.0)*(principal))))/((Math.log((annual_interest_rates/1200.0)+1.0))));
		System.out.println("\t"+ months);
		
		System.out.print("Total Amount Paid:");
		total_amount_paid = months * monthly_payment;
		System.out.print("\t"+ "\t"+ "$");
		System.out.printf("%.2f \n",total_amount_paid);
		System.out.print("Total Interest Paid:");
		total_interest_paid = total_amount_paid - principal; 
		System.out.print("\t"+ "\t"+ "$");
		System.out.printf("%.2f \n",total_interest_paid);
		System.out.print("Overpayment:");
		
		overpayment = monthly_payment*((months)-((Math.log(monthly_payment)-(Math.log((monthly_payment)-(annual_interest_rates/1200.0)*(principal))))/((Math.log((annual_interest_rates/1200.0)+1.0)))));
		System.out.print("\t"+ "\t"+ "\t"+ "$");
		System.out.printf("%.2f \n",overpayment);
		
		keyboard.close();

	}
}