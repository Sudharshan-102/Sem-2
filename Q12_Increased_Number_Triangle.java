package project;
import java.util.Scanner;

public class Increased_Number_Triangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the no:");
		int num = scanner.nextInt();
		int i=0;
		int increasing_number=1;
		while(i<=num) {
			for(int j=0;j<i;j++) {
				System.out.print(increasing_number);
				increasing_number+=1;
			}
			i++;
			System.out.println();
			
		}
		scanner.close();
	}
}
