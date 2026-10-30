import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no : ");
        String str = scanner.nextLine();
        String contain = " ";
        int len =0;
        if(!(str.contains("$"))){
            str+="$";
            contain="$";

        } else if (!(str.contains("@"))) {
            str+="@";
            contain="@";
        }
        else if (!(str.contains("~"))) {
            str+="~";
            contain="~";
        }
        int index =0;
        while(true){
            if (String.valueOf(str.charAt(index)).equals(contain)){
                break;
            }
            else {
                len+=1;
                index++;
            }
        }
        System.out.println("The length of the given Word is:"+len);


    }
}