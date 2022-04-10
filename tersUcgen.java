import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        tersUcgen();
    }

public static void tersUcgen() {
        Scanner girdi = new Scanner(System.in);
        int a = girdi.nextInt();

        for (int i = 0; i < a; i++) {

            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int l = 0; l < 2 * (a - i) - 1; l++) {
                System.out.print("*");
            }
            System.out.println("");

        }

    }
}
