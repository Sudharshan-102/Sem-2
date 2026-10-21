
import java.util.Scanner;
public class LabQs_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int high = 0;
        if (num2>num1){
            for (int i = 1;i<=num1 ;i++){
                if (num1%i ==0 && num2%i == 0){
                    high = i;
                }
            }


        } else if (num2<num1) {
            for (int i = 1;i<=num1 ;i++){
                if (num1%i ==0 && num2%i == 0){
                    high = i;
                }
            }
        }
        else{
            high = num1;
        }
        int  LCM = num1*num2/high;
        System.out.println(LCM);
    }
}
