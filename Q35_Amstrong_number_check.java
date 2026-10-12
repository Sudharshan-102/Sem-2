//(Qs)35. Armstrong Number Check
import java.util.Scanner;
public class LabQs_35 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        double sum = 0;
        for (int i = 0;i<num.length();i++){
            sum = (sum + Math.pow(Integer.parseInt(String.valueOf(num.charAt(i))),num.length()));
        }
        if (sum == Integer.parseInt(num)){
            System.out.println("amstrong number");
        }
        else{
            System.out.println("not a amstrong number");
        }
    }
}
