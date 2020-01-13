package junit;

import java.util.Scanner;

/**
 * @author Premsai Manthani
 * @purpose :this programs says the monthly payment for a amount and loan period
 *          and rate of interest
 * 
 */
public class MontlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		montly_payment o1 = new montly_payment();

		o1.process();

	}

	public static void process() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the principle amount");
		double p = s1.nextDouble();
		System.out.println("enter the loan period ");
		int y = s1.nextInt();
		System.out.println("enter the rate of interest");
		double r = s1.nextDouble();
		int month = 12 * y;
		double R = r / (12 * 100);
		double payment = (p * R) / (1 - Math.pow((1 + R), -month));
		System.out.println("the paymenth per month is " + payment);

	}

}
