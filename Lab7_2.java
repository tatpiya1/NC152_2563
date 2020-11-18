import java.util.Scanner;

public class Lab_7_2 {
	static int fact(int n) {
		int i, fact = 1;
		for(i = 1; i <= n; i++) 
			fact *= i;
		return fact;
	}
	
	static double sum(int n) {
		int i;
		double e = 1.0;
		for(i = 1; i <= n; i++)
			e += 1.0/fact(i);
		return e;
	}
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		System.out.println("a) " + n + "! = " + fact(n));
		System.out.println("b) e = "+ sum(n));
	}
}
