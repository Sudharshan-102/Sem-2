import java.util.Scanner;

public class LabQs_50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = scanner.nextInt();
        System.out.print("Enter end: ");
        int end = scanner.nextInt();

        System.out.println("Strong numbers in range:");


        for (int i = start; i <= end; i++) {
            int temp = i;
            int sum = 0;


            while (temp > 0) {
                int digit = temp % 10;


                int fact = 1;
                for (int j = 1; j <= digit; j++) {
                    fact *= j;
                }

                sum += fact;
                temp /= 10;
            }


            if (sum == i && i != 0) {
                System.out.println(i);
            }
        }
    }
}