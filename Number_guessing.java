
import java.util.Scanner;

public class Number_guessing {

	public static void NumberGame()
	{
		
		Scanner sc = new Scanner(System.in);
		int number = 1 + (int)(100*Math.random());	
		int a = 6;

		int i, guess;

		System.out.println("A number is choosen"+ " between 1 to 100."+ "Guess the number,"+ " within 6 trials.");

		for (i = 0; i < a; i++) {

			System.out.println("Guess the number:");
			guess = sc.nextInt();
			if (number == guess) {
				System.out.println("Congratulations!"+ " You guessed the number.");
                   break;
			}
			else if (number > guess&& i != a - 1) {
				System.out.println("The number is "+ "greater than " + guess);
			}
			else if (number < guess&& i != a - 1) {
				System.out.println("The number is"+ " less than " + guess);
			}
		}

		if (i == a) {
			System.out.println("You have completed"+ "trials.");

			System.out.println("The number was " + number);
		}
	}
	public static void main(String arg[])
	{
	     NumberGame();
	}
}
