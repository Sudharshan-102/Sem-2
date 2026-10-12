import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no : ");
        int num = scanner.nextInt();
        int divide_count=0;
        for(int i = 1;i<num/2;i++) {
            if (num % i == 0) {
                divide_count += 1;
            }
        }
        if (divide_count>1){
            System.out.println("The given number is not a prime number! ");
        }
        else {
            System.out.println("The given number is a prime!!");
        }
        scanner.close();
    }
}