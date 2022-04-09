import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        atmProjesiSwitchCase();
    }

public static void atmProjesiSwitchCase() {
        Scanner girdi = new Scanner(System.in);
        String userName, password;
        int girisHakki = 3;
        int bakiye = 1500;
        int secim;

        while (girisHakki > 0) {
            System.out.println("Kullanıcı adınızı giriniz: ");
            userName = girdi.nextLine();

            System.out.println("Şifrenizi giriniz: ");
            password = girdi.nextLine();

            if (userName.equals("Alpagu") && password.equals("123456")) {
                System.out.println("Giriş İşlemi Başarılı.\n" + "X Bankasına hoşgeldiniz.\n" + "Güncel Bakiyeniz:  " + bakiye);

                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: \n" + "1-Para Yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula \n" + "4-Çıkış Yap");
                    secim = girdi.nextInt();

                    switch (secim) {
                        case 1:
                            System.out.println("Yatırılacak Miktar: ");
                            int miktar = girdi.nextInt();
                            if (miktar > 0) {
                                bakiye += miktar;
                                System.out.println("Güncel miktar: " + bakiye);
                            } else {
                                System.out.println("Girilen miktar 0'dan büyük olmalı!");
                            }
                            break;
                        case 2:
                            System.out.println("Güncel bakiyeniz: " + bakiye + "\n" + "Çekmek istediğiniz miktarı giriniz: ");
                            int miktarCekme = girdi.nextInt();
                            if (bakiye < miktarCekme || miktarCekme < 0) {
                                System.out.println("Yetersiz Bakiye");
                            } else {
                                bakiye -= miktarCekme;
                                System.out.println("Güncel bakiyeniz: " + bakiye);
                            }
                            break;
                        case 3:
                            System.out.println("Güncel bakiyeniz: " + bakiye);
                            break;
                        case 4:
                            System.out.println("Bizi tercih ettiğiniz için teşekkürler...");
                            break;
                        default:
                            System.out.println("Yanlış veya varolmayan işlem tercihi.");
                            break;
                    }

                } while (secim != 4);


                break;


            } else {
                System.out.println("Hatalı kullanıcı adı veya şifre.");
                girisHakki -= 1;
                System.out.println("Kalan hakkınız: " + girisHakki);
                if (girisHakki == 0) {
                    System.out.println("Hesabınız bloke edildi.");
                }
            }
        }


    }
}
