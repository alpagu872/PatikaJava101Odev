import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        havaSicakliginaGoreEtkinlikOnerisi();

    }


    public static void havaSicakliginaGoreEtkinlikOnerisi(){
        int sicaklik;
        Scanner girdi = new Scanner(System.in);
        sicaklik = girdi.nextInt();

        if (sicaklik<5){
            System.out.println("Kayak");
        }else if (sicaklik > 5 && sicaklik <15 ){
            System.out.println("Sinema");
        }else if(sicaklik > 15 && sicaklik < 25){
            System.out.println("Piknik");
        }else if (sicaklik > 25){
            System.out.println("Yüzme");
        }



    }
}
