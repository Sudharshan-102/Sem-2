import java.util.Scanner;
public class LabQs_33 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String rnum = "";
        for (int i = num.length()-1;i>=0;i--){
            rnum = rnum + num.charAt(i);

        }
        System.out.println(rnum);

    }
}
