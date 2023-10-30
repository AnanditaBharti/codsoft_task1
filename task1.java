import java.util.Random;
import java.util.Scanner;
public class task1 {
	static Scanner sc=new Scanner(System.in);
	
	
	public static boolean compare(int num)
	{
		System.out.print("Enter a number between 1 to 100:");
		int guess=sc.nextInt();
		
		if(guess==num)
		{
			System.out.println("Hurray! Your guess is CORRECT!");
			return true;
		}
		else if(guess<num)
		{
			System.out.println("Your guess is too low!");
			//System.out.println("You guessed "+guess+" but our number was "+num+".");
		}
		else
		{
			System.out.println("Your guess is too high!");
			//System.out.println("You guessed "+guess+" but our number was "+num+".");
		}
		return false;
	}
	public static void main(String[] args) {
		Random ran=new Random();
		int num=ran.nextInt(1,101);
		System.out.print("How many attempts do you need to guess the correct number? : ");
		int attempts=sc.nextInt();
		int i=1;
		for(;i<=attempts;i++)
		{
			boolean output=compare(num);
			if(output) {
				System.out.print("You guessed the correct number in your "+i+((i==1)?"st":(i==2)?"nd":"th")+" try!");
				break;
			}
			System.out.println();
		}
		if(i==attempts+1)
		{
			System.out.println("You LOST! The correct number was \""+num+"\". You could'nt guess it in "+attempts+" attempts!");
			
		}
	}

}
