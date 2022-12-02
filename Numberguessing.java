import java.lang.*;
import java.util.*;
public class Numberguessing
{
    // number guessing game
	public static void guessingNumberGame()
	{
		Scanner sc= new Scanner(System.in);
        int number= 1 + (int)(100 * Math.random());
		int K= 7;
        int i;
        System.out.println("Number is chosen  between 1 to 100. Guess the number within " + K  + " trials.");
		for (i = 0; i < K; i++)
        {

			System.out.println("Guess the number:");
			int guess = sc.nextInt();
			if (number == guess) 
            {
				System.out.println("Congratulations! You guessed the number.");
				break;
			}
			else if (number > guess && i != K - 1)
             {
                System.out.println("The number is greater than " + guess);
			}
			else if (number < guess && i != K - 1) 
            {
				System.out.println("The number is less than " + guess);
			}
		}
        if (i == K) 
        {
			System.out.println("Oh No!! You have exhausted K trials.");
            System.out.println("The number was " + number);
		}
	}
	public static void main(String arg[])
	{
		guessingNumberGame();
	}
}

