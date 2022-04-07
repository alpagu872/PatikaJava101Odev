import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        artikYilHesaplama();

    }
public static void artikYilHesaplama() {
        Scanner girdi = new Scanner(System.in);

        int yil;
        boolean artikYil;

        yil = girdi.nextInt();
        if (yil % 100 == 0) {
            artikYil = (yil % 400 == 0);
            if (artikYil == true) {
                System.out.println(yil + " artik yildir.");
            } else {
                System.out.println(yil + " artık yıl değildir.");

            }
            
        } else if (yil % 4 == 0) {
            System.out.println(yil + " artık yıldır.");
        } else {
            System.out.println(yil + " artık yıl değildir.");
        }
        
    }

}
