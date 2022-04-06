import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        notOrtHesaplayanProgUpgrade();

    }

public static void notOrtHesaplayanProgUpgrade() {
        int matNot, fizikNot, kimyaNot, turkceNot, tarihNot, muzikNot;
        Scanner girdi = new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        matNot = girdi.nextInt();

        System.out.println("Fizik Notunuz: ");
        fizikNot = girdi.nextInt();

        System.out.println("Kimya Notunuz: ");
        kimyaNot = girdi.nextInt();

        System.out.println("Türkçe Notunuz ");
        turkceNot = girdi.nextInt();

        System.out.println("Tarih Notunuz: ");
        tarihNot = girdi.nextInt();

        System.out.println("Müzik Notunuz: ");
        muzikNot = girdi.nextInt();

        float toplam = (matNot+fizikNot+kimyaNot+turkceNot+tarihNot+muzikNot);
        float sonuc = (float) (toplam / 6.0);

        System.out.println("Ortalamanız: " + sonuc);
        String gecti = sonuc > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(gecti);

    }}
