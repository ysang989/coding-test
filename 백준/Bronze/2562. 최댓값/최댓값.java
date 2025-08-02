import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x > n) {
                n = x;
                index = i+1;
            }
        }
        System.out.println(n);
        System.out.println(index);
    }
}