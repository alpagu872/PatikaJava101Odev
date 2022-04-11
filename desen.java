
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int n = girdi.nextInt();

        desen(n);

    }
    public static int desen(int n) {
        System.out.println(n);

        if (n <= 0) {
            return n;
        } else {
            desen(n - 5);
            System.out.println(n);
        }
        return n;
    }}
