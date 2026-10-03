import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no:");
        int num = scanner.nextInt();
        int loop =1;
        int dummy =1;
        int sum=0;
        while(loop<=num) {
            if(dummy%2 !=0 ) {
                sum+=dummy;
                System.out.print(dummy+" ");
                loop+=1;
            }
            dummy+=1;
        }
        System.out.println("The of odd sum given naturals number is: "+sum);
        scanner.close();
    }
}
