import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        kombOdevi();
    }

public static void kombOdevi(){

        //Java ile kombinasyon hesaplayan program yazınız.

        Scanner girdi = new Scanner(System.in);
        System.out.println("N değerini giriniz: ");
        int n = girdi.nextInt();
        System.out.println("R değerini giriniz: ");
        int r = girdi.nextInt();


        int totaln = 1,totalr=1;
        int nEksiRfak = 1;

        for (int i = 1 ; i <= n; i++){
            totaln = totaln * i ;
        }

        for (int j = 1 ;  j <= r ; j++){
            totalr = totalr * j;
        }

        for (int i = 1 ; i <= n-r ; i++){
            nEksiRfak *=i;
        }

        double komb = (totaln) / ((totalr) * (nEksiRfak));

        System.out.println(komb);
    }


}
