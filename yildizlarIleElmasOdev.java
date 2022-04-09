import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        yildizlarIleElmasOdev();
    }

public static void yildizlarIleElmasOdev() {
        Scanner girdi = new Scanner(System.in);
        int yukseklik = girdi.nextInt(); //yükseklik hep tek sayi olacaktir
        int yariyukseklik = (int) (yukseklik / 2) + 1;

        for (int i = 0; i < yariyukseklik; i++) {
            for (int j = 1; j <= yariyukseklik - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");

            System.out.println();
        }
        //üst yarısı tamam
        for (int i = yariyukseklik - 1; i >= 1; i--) {
            for (int j = 1; j <= yariyukseklik - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");

            System.out.println();
        }

    }
}
