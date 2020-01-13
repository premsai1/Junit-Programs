package junit;

import java.util.Scanner;

/**
 * @author Premsai Manthani
 * @purpose : this program will display the temperature after the converction
 *          based on the input.
 * 
 */
public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		temperatureconverter o1 = new temperatureconverter();
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the option to be performed");
		System.out.println("1.Celsius_to_Fahrenheit");
		System.out.println("2.Fahrenheit_to_Celsius");
		int option = s1.nextInt();
		switch (option) {
		case 1:

			System.out.println("enter the celsius");
			double celsius = s1.nextDouble();
			convert(celsius);
			break;
		case 2:
			System.out.println("enter thr fahrenheit ");
			double fahrenheit = s1.nextDouble();
			convert1(fahrenheit);
			break;

		default:
			System.out.println("ente the correct option");
		}

		double fahrenheit = s1.nextDouble();

	}
	// converts the celsius to fahreneit
	public static void convert(double celsius) {
		double Celsius_to_Fahrenheit = ((celsius * 9 / 5) + 32);
		System.out.println("the fahrenheit is" + Celsius_to_Fahrenheit);
	}
	// converts the  fahreneit to celsius 
	public static void convert1(double fahrenheit) {
		double Fahrenheit_to_Celsius = ((fahrenheit - 32) * 5 / 9);
		System.out.println("the celsius is " + Fahrenheit_to_Celsius);
	}

}
