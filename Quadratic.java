import java.util.Scanner;

public class Quadratic {
	public static void main (String[] args){
		Scanner.in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if (a == 0 || Math.pow(b,2) - 4*a*c < 0){
			return System.out.println("Error");
		}else{
			return System.out.println((-1*b + Math.sqrt(Math.power(b,2) - 4*a*c)) / 2*a + " " + (-1*b - Math.sqrt(Math.power(b,2) - 4*a*c)) / 2*a);
		}
		
		
