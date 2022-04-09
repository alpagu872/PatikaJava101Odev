import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        perfectNumber();
    }

public static void perfectNumber() {
        Scanner girdi = new Scanner(System.in);

        int a = girdi.nextInt();
        int toplam = 0;

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                toplam += i;
            }
        }

        if (toplam == a) {
            System.out.println(a + " Mükemmel sayıdır.");
        } else {
            System.out.println(a + " Mükemmel sayı değildir.");
        }
    }
}
