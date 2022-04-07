import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        cinZodyagi();

    }


    public static void cinZodyagi() {
        Scanner girdi = new Scanner(System.in);
        int yil, zodyak;
        yil = girdi.nextInt();

        zodyak = yil % 12;

        if (zodyak == 0) {
            System.out.println("Maymun");

        } else if (zodyak == 1) {
            System.out.println("Horoz");

        } else if (zodyak == 2) {
            System.out.println("Köpek");

        } else if (zodyak == 3) {
            System.out.println("Domuz");

        } else if (zodyak == 4) {
            System.out.println("Fare");

        } else if (zodyak == 5) {
            System.out.println("Öküz");

        } else if (zodyak == 6) {
            System.out.println("Kaplan");

        } else if (zodyak == 7) {
            System.out.println("Tavşan");

        } else if (zodyak == 8) {
            System.out.println("Ejderha");

        } else if (zodyak == 9) {
            System.out.println("Yılan");

        } else if (zodyak == 10) {
            System.out.println("At");


        } else if (zodyak == 11) {
            System.out.println("Koyun");

        }else {
            System.out.println("Yanlış input");
        }

    }


}
