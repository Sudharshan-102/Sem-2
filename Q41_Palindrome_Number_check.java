//(Qs)41. Palindrome Number Check
import java.util.Scanner;
public class LabQs_34 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String rnum = "";
        for (int i = num.length()-1;i>=0;i--){
            rnum = rnum + num.charAt(i);

        }
        System.out.println(rnum);
        if (num.equals(rnum)){
            System.out.println("PALINDROME");
        }
        else{
            System.out.println("NOT A PALINDROME");
        }

    }
}
