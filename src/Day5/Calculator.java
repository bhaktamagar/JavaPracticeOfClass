package Day5;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1 is");
		int num1 = input.nextInt();
		
		System.out.println("Enter number 2 is: ");
		int num2 = input.nextInt();
		
		int sum = num1 + num2;
		System.out.println("Addition of num1 + num2 is:" + " " + sum);
				
		int sub = num1 - num2;
		System.out.println("Substruction of num1 + num2 is:" + " " + sub);
		
		int mul = num1 * num2;
		System.out.println("Multiplication of num1 + num2 is:" + " " + mul);
		
		int div = num1 / num2;
		System.out.println("Division of num1 + num2 is:" + " " + div);
		
		int modu = num1 % num2;
		System.out.println("Modulus of num1 + num2 is:" + " " + modu);			
	}
}