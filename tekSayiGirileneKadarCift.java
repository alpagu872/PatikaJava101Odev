import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        tekSayiGirileneKadarCift();
    }


    public static void tekSayiGirileneKadarCift(){

        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
        // ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan
        // programı yazıyoruz.

        Scanner girdi = new Scanner(System.in);
        int deger, toplam = 0 ;

        do {
            System.out.println("Değer Giriniz: ");
            deger = girdi.nextInt();
            if (deger % 4 == 0){
                toplam +=deger;
            }

        }while(!(deger % 2 == 1));
        System.out.println("Toplam : " + toplam);

    }


}
