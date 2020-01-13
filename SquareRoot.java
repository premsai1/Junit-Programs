package junit;

import java.util.Scanner;

/**
 * @author Premsai Manthani
 * @purpose : this program will display the squareroot of a no.
 * 
 */
public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sqrt o1 = new sqrt();
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the value");

		int value = s1.nextInt();

		double t = value;
		double epsilon = 1e-15;
		while (Math.abs(t - (value / t)) > epsilon * t) {
			t = (t + (value / t)) / 2;
		}
		System.out.println(t);
	}

}
