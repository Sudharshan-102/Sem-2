package project;
import java.util.Scanner;

public class n_Terms_and_Sum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the no : ");
		int num = scanner.nextInt();
		int sum =0;
		for(int i =1;i<=num;i++) {
			sum+=i;	}
		System.out.println("The sum of first 10 natural numbers is : "+sum);
	}
}
