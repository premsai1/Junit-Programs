package junit;

import java.util.Scanner;

/**
 * @author Premsai Manthani
 * @purpose : this program displays the vendor machine functionalities.
 *
 */
public class VendorMachine {
	Scanner s1 = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vendormahine o1 = new vendormahine();
		Scanner s1 = new Scanner(System.in);

		System.out.println("enter the amount ");
		int amount = s1.nextInt();
		o1.vendormachine(amount);
	}

	public void vendormachine(int amount) {
		int notes_of_1000 = amount / 1000;
		amount = amount % 1000;
		System.out.println(" " + amount);
		int notes_of_500 = amount / 500;
		amount = amount % 500;
		System.out.println(" " + amount);
		int notes_of_100 = amount / 100;
		amount = amount % 100;
		System.out.println(" " + amount);
		int notes_of_50 = amount / 50;
		amount = amount % 50;
		System.out.println(" " + amount);
		int notes_of_10 = amount / 10;
		amount = amount % 10;
		System.out.println(" " + amount);
		int notes_of_5 = amount / 5;
		amount = amount % 5;
		System.out.println(" " + amount);
		int notes_of_2 = amount / 2;
		amount = amount % 2;
		System.out.println(" " + amount);
		int notes_of_1 = amount / 1;
		amount = amount % 1;
		System.out.println(" " + amount);
		int no_of_notes = (notes_of_1000 + notes_of_500 + notes_of_100 + notes_of_50 + notes_of_10 + notes_of_5
				+ notes_of_2 + notes_of_1);

		System.out.println("the total minimum change is");
		System.out.println("1000*" + notes_of_1000 + "=" + (1000 * notes_of_1000));

		System.out.println("500*" + notes_of_500 + "=" + (500 * notes_of_500));
		System.out.println("100*" + notes_of_100 + "=" + (100 * notes_of_100));
		System.out.println("50*" + notes_of_50 + "=" + (50 * notes_of_50));
		System.out.println("10*" + notes_of_10 + "=" + (10 * notes_of_10));
		System.out.println("5*" + notes_of_5 + "=" + (5 * notes_of_5));
		System.out.println("2*" + notes_of_2 + "=" + (2 * notes_of_2));
		System.out.println("1*" + notes_of_1 + "=" + (1 * notes_of_1));

		System.out.println("the no of notes =" + no_of_notes);

	}

}
