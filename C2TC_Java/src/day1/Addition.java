package day1;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the values: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = a+b;
		
		System.out.print("Addition of a = " + a + ", b = " + b + " is " + c);

	}

}
