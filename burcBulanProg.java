import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        burcBulanProg();

    }


    public static void burcBulanProg() {

        int month, day;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Doğduğunuz ay: ");
        month = girdi.nextInt();

        System.out.println("Doğduğunuz gün: ");
        day = girdi.nextInt();

        switch (month) {
            case 1:
                if (1 <= day && day <= 31) {
                    if (day < 22) {
                        System.out.println("Oğlak Burcu");
                    } else {
                        System.out.println("Kova Burcu");
                    }
                }
                break;

            case 2:
                if (1 <= day && day <= 28) {
                    if (day < 19) {
                        System.out.println("Kova Burcu");
                    } else {
                        System.out.println("Balık Burcu");
                    }
                }
                break;
            case 3:
                if (1 <= day && day <= 31) {
                    if (day < 20) {
                        System.out.println("Balık Burcu");
                    } else {
                        System.out.println("Koç Burcu");

                    }
                }
                break;
            case 4:
                if (1 <= day && day <= 30) {
                    if (day < 21) {
                        System.out.println("Koç Burcu");
                    } else {
                        System.out.println("Boğa Burcu");
                    }
                }
                break;
            case 5:
                if (1 <= day && day <= 29) {
                    if (day < 21) {
                        System.out.println("Boğa Burcu");
                    } else {
                        System.out.println("İkizler Burcu");
                    }
                }
                break;
            case 6:
                if (1 <= day && day <= 30) {
                    if (day < 22) {
                        System.out.println("İkizler Burcu");
                    } else {
                        System.out.println("Yengeç Burcu");
                    }
                }
                break;
            case 7:
                if (1 <= day && day <= 31) {
                    if (day < 22) {
                        System.out.println("Yengeç Burcu");
                    } else {
                        System.out.println("Aslan Burcu");
                    }
                }
                break;
            case 8:
                if (1 <= day && day <= 31) {
                    if (day < 22) {
                        System.out.println("Aslan Burcu");
                    } else {
                        System.out.println("Başak Burcu");
                    }
                }
                break;
            case 9:
                if (1 <= day && day <= 30) {
                    if (day < 23) {
                        System.out.println("Başak Burcu");
                    } else {
                        System.out.println("Terazi Burcu");
                    }
                }
                break;
            case 10:
                if (1 <= day && day <= 30) {
                    if (day < 22) {
                        System.out.println("Terazi Burcu");
                    } else {
                        System.out.println("Akrep Burcu");
                    }
                }
                break;
            case 11:
                if (1 <= day && day <= 30) {
                    if (day < 21) {
                        System.out.println("Akrep Burcu");
                    } else {
                        System.out.println("Yay Burcu");
                    }
                }
                break;
            case 12:
                if (1 <= day && day <= 31) {
                    if (day < 21) {
                        System.out.println("Yay Burcu");
                    } else {
                        System.out.println("Oğlak Burcu");
                    }
                }
                break;

            default:
                System.out.println("Hatalı giriş.");
                break;
        }


    }


}
