import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str1 = sc.nextLine();

            if ("0".equals(str1)) { // 종료 조건
                break;
            }

            StringBuffer str = new StringBuffer(str1);
            String str2 = str.reverse().toString();

            if (str1.equals(str2)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        sc.close();
    }
}
