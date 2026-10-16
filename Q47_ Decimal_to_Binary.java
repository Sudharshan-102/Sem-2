import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int num = scanner.nextInt();
        String binary = "";
        if (num == 0) {
            binary = "0";
        }
        while (num > 0) {
            int rem = num % 2;
            binary = rem + binary;
            num = num / 2;
        }
        System.out.println("Binary = " + binary);
    }
}