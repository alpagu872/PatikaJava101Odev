import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        eKadarCiftSayiBulanProg();
    }

public static void eKadarCiftSayiBulanProg() {
  
        Scanner girdi = new Scanner(System.in);

        int sayi;
        int toplam = 0, sayac = 0, ort;

        System.out.println("Sayiyi giriniz: ");
        sayi = girdi.nextInt();


        for (int i = 1; i < sayi; i++) {

            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam += i;
                sayac++;
                System.out.println(i);
            }


        }
  
        ort = toplam / sayac;
        System.out.println("Ortalama: " + ort);



    }


}
