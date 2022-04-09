
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        minVeMax();
    }

public static void minVeMax(){
        Scanner girdi = new Scanner(System.in);
        int total, geciciMax = 0, geciciMin= 999999999;
        System.out.print("Toplam kaç adet sayı gireceksiniz ? : ");
        total = girdi.nextInt();
        
        for (int i = 0 ; i < total; i++){
            System.out.println("Sayı: ");
            int girilenSayi = girdi.nextInt();
            if (girilenSayi >=geciciMax){
                geciciMax = girilenSayi;
            }if (girilenSayi <= geciciMin){
                geciciMin = girilenSayi;
            }
        }
        System.out.println("Max: "+ geciciMax);
        System.out.println("Min: "+geciciMin);
    }
    
    
}
