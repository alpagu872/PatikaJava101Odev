import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        basamakToplamaOdev();
    }

public static void basamakToplamaOdev() {

        //Ödev
        //Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        //
        //Örnek : 1643 = 1 + 6 + 4 + 3 = 14

        Scanner girdi = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int girilenDeger = girdi.nextInt();
        int basamakToplam = 0;


        while (girilenDeger != 0) {
            int basamakDegeri = girilenDeger % 10;
            basamakToplam = basamakDegeri + basamakToplam;
            girilenDeger = girilenDeger / 10;
        }

        System.out.println(basamakToplam);
        //Kodu adım adım işletmek için;
        //https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public+class+ClassNameHere+%7B%0A+++public+static+void+main(String%5B%5D+args)+%7B%0A++++++int+girilenDeger+%3D+258%3B%0A++++++++int+basamakToplam+%3D+0%3B%0A%0A%0A++++++++while+(girilenDeger+!%3D+0)+%7B%0A++++++++++++int+basamakDegeri+%3D+girilenDeger+%25+10%3B%0A++++++++++++basamakToplam+%3D+basamakDegeri+%2B+basamakToplam%3B%0A++++++++++++girilenDeger+%3D+girilenDeger+/+10%3B%0A++++++++%7D%0A%0A++++++++System.out.println(basamakToplam)%3B%0A+++%7D%0A%7D&mode=display&curInstr=0



    }
