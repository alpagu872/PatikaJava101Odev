
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        kullaniciGirisi();
    }


public static void kullaniciGirisi() {
        Scanner girdi = new Scanner(System.in);
        String username, password;

        System.out.println("Kullanıcı adınız:");
        username = girdi.nextLine();

        System.out.println("Şifreniz:");
        password = girdi.nextLine();

        if ((username.equals("Alpagu")) && (password.equals("123"))) {
            System.out.println("Başarıyla giriş yapıldı...\n" +
                    "Yönlendiriliyorsunuz...");

        } else if (!(password.equals("123")) && !(username.equals("Alpagu"))) {
            System.out.println("Kullanıcı adınız veya şifreniz yanlış, tekrar deneyiniz.");
            kullaniciGirisi();
        } else if (!(password.equals("123"))) {
            System.out.println("Şifrenizi sıfırlamak ister misiniz?");

            System.out.println("1-HAYIR\n" +
                    "2-EVET");
            int secim = girdi.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("Giris ekranına yönlendiriliyorsunuz.");
                    kullaniciGirisi();
                    break;
                case 2:
                    System.out.println("Şifre sıfırlama ekranına yönlendiriliyorsunuz.");
                    sifreSifirlama("123");
                    break;
                default:
                    kullaniciGirisi();
                    break;
            }
        }


    }

    public static String sifreSifirlama(String inputPass) {
        Scanner girdi = new Scanner(System.in);

        String yeniSifre;

        System.out.println("Yeni şifrenizi giriniz:");
        yeniSifre = girdi.nextLine();
        if (yeniSifre.equals(inputPass)) {
            System.out.println("Şifre oluşturulamadı, Lütfen farklı bir şifre deneyiniz.");
            sifreSifirlama(inputPass);
        } else {
            System.out.println("Yeni şifreniz oluşturuldu.\n" +
                    "Giriş ekranına yönlendiriliyorsunuz....");
        }
        kullaniciGirisi();
        return yeniSifre;

    }

}
