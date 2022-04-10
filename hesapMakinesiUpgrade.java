

import java.util.Scanner;


public class Main {

    static int plus(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println(result);
        return a - b;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println(result);
        return a * b;
    }

    static int divided(int a, int b) {
        int result = a / b;
        System.out.println(result);
        return a / b;
    }


    public static void main(String[] args) {
        // DEVAMINI GETİRECEĞİM FAKAT ŞU AN DEĞİL...
        
        Scanner girdi = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n";
        while (true) {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = girdi.nextInt();
            if (select == 0) {
                break;
            }
            int a, b;
            System.out.println("İlk sayıyı giriniz: ");
            a = girdi.nextInt();
            System.out.println("İkinci sayıyı giriniz: ");
            b = girdi.nextInt();
            switch (select) {
                case 1:
                    plus(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        }


    }
