//(Qs)34. Perfect Numbers in Range


public class LabQs_23 {
    public static void main(String args[]){
        for (int j = 1;j<=50;j++) {
            int sum = 0;
            for (int i = 1; i < j; i++) {
                if (j % i == 0) {
                    sum = sum + i;
                }
            }
            if (sum == j) {
                System.out.println(j + " is a perfect number");
            }
            }
        }
    }


