package project;
import java.util.Scanner;

public class floyds_triangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the no:");
		int num = scanner.nextInt();
		int i=0;
		while(i<=num) {
			for(int j=0;j<i;j++) {
				int ps = (i+j)%2;
				System.out.print(ps);
			}
			i++;
			System.out.println();
		}
		scanner.close();
	}
}
