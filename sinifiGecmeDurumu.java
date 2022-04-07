import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        sinifiGecmeDurumu();

    }

public static void sinifiGecmeDurumu() {
        Scanner girdi = new Scanner(System.in);
        int sayac = 0, toplam = 0, ortalama;

        int mat, fizik, turkce, kimya, muzik;


        System.out.println("Matematik notunuz:");
        mat = girdi.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            sayac++;
        }
        System.out.println("Fizik notunuz:");
        fizik = girdi.nextInt();
        if (fizik >= 0 && fizik <= 100) {

            toplam += fizik;
            sayac++;
        }
        System.out.println("Türkçe notunuz:");
        turkce = girdi.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            sayac++;
        }
        System.out.println("Kimya notunuz:");
        kimya = girdi.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            sayac++;
        }
        System.out.println("Müzik notunuz:");
        muzik = girdi.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            sayac++;
        }
        if (sayac == 0) {
            System.out.println("Geçersiz ders sayısı");

        } else {
            ortalama = (toplam / sayac);
            if (ortalama <= 55) {
                System.out.println(ortalama + " ile sınıfta kaldınız.");
            } else {
                System.out.println(ortalama + " ile sınıfı geçtiniz.");
            }

        }


    }
}
