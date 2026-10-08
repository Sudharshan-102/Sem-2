import java.util.Scanner;
public class LabQs_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Limit : ");
        int limit = scanner.nextInt();
        System.out.print("Enter the x Value : ");
        int xval = scanner.nextInt();
        double sum = 1;
        int n = 1;
        for (int i = 2;i<=(limit-1)*2;i = i + 2){
            sum = sum + Math.pow(-1,n)*Math.pow(xval, i) / factorial(i);
            n = n + 1;
        }
        System.out.println(sum);



    }
    static int factorial(int num){
        int fact = 1;
        for (int i = 1;i<=num;i++){
            fact = fact * i;
        }
        return fact;
    }
}
