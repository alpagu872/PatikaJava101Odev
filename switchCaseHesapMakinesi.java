import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        switchCaseHesapMakinesi();
    }


    public static void switchCaseHesapMakinesi() {
        Scanner girdi = new Scanner(System.in);
        System.out.println("1-TOPLAMA \n" +
                "2-ÇIKARMA\n" +
                "3-ÇARPMA\n" +
                "4-BÖLME");
        int a = girdi.nextInt();
        int n1, n2;

        System.out.println("İlk sayıyı giriniz: ");
        n1 = girdi.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        n2 = girdi.nextInt();


        switch (a) {

            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                System.out.println((float) n1 / n2);
                break;
            default:
                System.out.println("Geçersiz işlem");
                switchCaseHesapMakinesi();

        }


    }


}
