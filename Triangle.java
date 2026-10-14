import java.util.Scanner;

public class Triangle{
	public static void main (String[] args){
		System.out.println("Type in 3 numbers");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if ( a > b+c || b > a+c || c > a+b){
			System.out.println("Not possible to form a triangle");
		} else if ( a <= 0 || b<= 0 || c<= 0){
			System.out.println("Error");
		} else {
			System.out.println("Possible to form a triangle");
		}
	}
}
