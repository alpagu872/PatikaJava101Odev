import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ucakBiletiHesaplama();

    }


public static void ucakBiletiHesaplama() {
        Scanner girdi = new Scanner(System.in);

        float toplam, km, yasIndirimi = 1, kmF = 0.1f, yonIndirimi = 1;
        int yas, gidisGelis = 1;

//        //inputlar
//        //inputlar
//        //inputlar
//
//        if (//şart kontrolü)
//        else{
//            //koşullara göre yeni değişken değerlerinin belirlenmesi
//
//            //total hesap
//            //kapanış
//        }
        System.out.println("Yaşınız:");
        yas = girdi.nextInt();

        System.out.println("Km cinsinden gideceğiniz mesafe;");
        km = girdi.nextInt();

        System.out.println("1-TEK YÖN \n" +
                "2-GİDİŞ GELİŞ");

        gidisGelis = girdi.nextInt();

        if (yas < 0 || km < 0 || (gidisGelis != 1 && gidisGelis != 2)) {
            System.out.println("Yanlış Değer Girişi");
        } else {
            if (yas < 12) {
                yasIndirimi = 0.5f;
            } else if (12 < yas && yas < 24) {
                yasIndirimi = 0.9f;
            } else if (yas > 65) {
                yasIndirimi = 0.7f;
            }
            if (gidisGelis == 2) {
                yonIndirimi = 1.6f;

            }
            toplam = km * kmF *yasIndirimi * yonIndirimi;
            System.out.println(toplam);
        }
    }


}
