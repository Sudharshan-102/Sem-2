import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int sum =0;
            double avg =0;
            for(int i =1;i<11;i++) {
                System.out.print("Enter no"+i+":");
                int j = scanner.nextInt();
                sum+=j;
            }
            avg = sum/10.0;
            System.out.println("The sum of first 10 natural numbers is : "+sum);
            System.out.println("the average of first 10 numbers is : "+avg);
            scanner.close();
        }
}