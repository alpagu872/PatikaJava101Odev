import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        harmonikSayilariBulanProg();
    }

    public static void harmonikSayilariBulanProg(){

        // Java ile girilen sayının harmonik serisini bulan program yazacağız.
        //
        //Harmonik Seri Formülü : 1+ 1/2 + 1/3 + 1/4 + 1/5 + .... +  1 / n

        Scanner girdi = new Scanner(System.in);
        float girilenDeger = girdi.nextInt();
        double toplam = 0.0;

        for (float i = 1 ; i  <= girilenDeger ; i++){
            toplam += (1/i);
        }
        System.out.println(toplam);

    }


}
