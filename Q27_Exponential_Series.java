//(Qs)27. Exponential Series

import java.util.Scanner;
public class LabQs_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Limit : ");
        int limit = scanner.nextInt();
        System.out.print("Enter the x Value : ");
        int xval = scanner.nextInt();
        double sum = 1;
        for (int i = 1;i<limit;i++){
            sum = sum + Math.pow(xval, i) / factorial(i);
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
