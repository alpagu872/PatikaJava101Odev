import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        usluSayiHesapFor();
    }

public static void usluSayiHesapFor(){
        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı
        // "For Döngüsü" kullanarak yapınız.

        Scanner girdi = new Scanner(System.in);
        int n,k, sonuc = 1;
        n = girdi.nextInt();
        k = girdi.nextInt();

        for (int i = k; i != 0  ; i--){
            sonuc *= n;
        }
        System.out.println(sonuc);

    }


}
