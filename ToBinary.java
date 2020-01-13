package junit;

import java.util.Scanner;

/**
 * @author Premsai Manthani
 * @purpose : this program will change a given no into a binary no and displays
 *          it.
 * 
 */
public class ToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tobinary o1 = new tobinary();
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the no that should be converted into binnary");
		int n = s1.nextInt();

		o1.binary(n);
	}
	//converts given no to binary
	public static void binary(int n) {
		int i = 0;
		int a1[] = new int[10];
		while (n > 0) {
			a1[i] = n % 2;

			n = n / 2;
			i++;

		}
		for (int j = i; j > i; j--) {
			System.out.println(a1[j]);

		}
	}

}
