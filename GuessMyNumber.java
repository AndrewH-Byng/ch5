import java.util.Random;
import java.util.Scanner;
public class GuessMyNumber {
	public static void main (String[] args){
		Random random =new Random();
		int number = random.nextInt(100) + 1;
		System.out.println("I'm thinking of a number between 1 and 100");
		System.out.println("Can you guess what it is?");
		System.out.print("Type a number: ");
		Scanner in = new Scanner(System.in);
		int inputnumber = in.nextInt();
		int count = 1;
		
		
		if (inputnumber > number){
			System.out.println("Too high guess again");
			inputnumber = in.nextInt();
			count += 1;
		}
		if (inputnumber < number){
			System.out.println("Too low guess again");
			inputnumber = in.nextInt();
			count += 1;
		}
		if (count == 3){
			return;
		}
			
		if (inputnumber > number){
			System.out.println("Too high guess again");
			inputnumber = in.nextInt();
			count += 1;
		}
			if (count == 3){
			return;
		}
		if (inputnumber < number){
			System.out.println("Too low guess again");
			inputnumber = in.nextInt();
			count += 1;
		}
			if (count == 3){
			return;
		}
			if (inputnumber > number){
			System.out.println("Too high guess again");
			inputnumber = in.nextInt();
			count += 1;
		}
			if (count == 3){
			return;
		}
		if (inputnumber < number){
			System.out.println("Too low guess again");
			inputnumber = in.nextInt();
			count += 1;
		}
		
		if (count == 3){
			return;
		}
	}
}

	
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		

		
		
	

		
