import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        asalBulma();
    }

public static void asalBulma() {
        Scanner girdi = new Scanner(System.in);
        int input = girdi.nextInt();
        int sayac = 0;

        for (int i = 2; i < input; i++) {
            for (int j = 2; j < input; j++) {
                if (i % j == 0) {
                    sayac++;
                }
            }

            if (sayac < 2) {
                System.out.print(i + ",");

            }
            sayac = 0;
        }


    }
}
