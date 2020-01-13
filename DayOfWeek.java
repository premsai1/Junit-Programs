package junit;

import java.util.Scanner;

/**
 * @author Premsai Manthani
 * @purpose : this program will return will day-of-week for the entered date .
 * 
 */
public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day_of_week o1 = new day_of_week();

		Scanner s1 = new Scanner(System.in);
		System.out.println(" enter the date ");
		int d = s1.nextInt();
		System.out.println("enter the month ");
		int m = s1.nextInt();
		System.out.println("enter the year");
		int y = s1.nextInt();
		int day = o1.process(d, m, y);
		if (day == 0) {
			System.out.println("the day is sunday");
		} else if (day == 1) {
			System.out.println("the day is monday");
		} else if (day == 2) {
			System.out.println("the day is tuesday");
		} else if (day == 3) {
			System.out.println("the day is Wednesday");

		} else if (day == 4) {
			System.out.println("the day is thrusday");
		} else if (day == 5) {
			System.out.println("the day is friday");
		} else if (day == 6) {
			System.out.println("the day is Saturday");
		}

	}

	public int process(int d, int m, int y) {

		int y0 = (y - (14 - m) / 12);
		int x = (y0 + (y0 / 4) - (y0 / 100) + (y0 / 400));
		int m0 = (m + 12 * ((14 - m) / 12) - 2);
		int d0 = ((d + x + 31 * m0 / 12) % 7);

		return d0;

	}

}
