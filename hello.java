package Factorial;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter a number :");
		int number = scanner.nextInt();
		int result = calculateFactorial(number);
		System.out.println("Factorial is:"+result);

	}
	
	public static int calculateFactorial(int n) {
		if (n==0) {
			return 1;
		}
		else {
			int result = 1;
			for(int i=1; i<=n; i++) {
				result*=i;
			}
			return result;
		}
	}

}