import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            if (a % 3 == 0) {
                count1 += 1;
            } 
            
            if (a % 5 == 0) {
                count2 += 1;
            }

        }

        System.out.print(count1 + " " + count2);
    }
}