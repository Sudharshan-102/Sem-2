//(Qs)28. Alternate Sum Series

import java.util.Scanner;
public class LabQs_30 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double limit = scanner.nextDouble();
        double x = scanner.nextDouble();
        double pow = 1;
        double sum = 0;
        for (int i = 1;i<=limit;i++){
            sum = (sum + Math.pow(-1,i+1)*Math.pow(x,pow));
            pow = pow + 2;


        }
        System.out.println(sum);

    }
}
