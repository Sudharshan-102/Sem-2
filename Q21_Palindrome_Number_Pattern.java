package project;
import java.util.Scanner;

public class Palindrome_Number_Pattern {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no: ");
        int num = scanner.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for (int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
	}
	
}
