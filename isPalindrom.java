import java.util.Scanner;


public class Main {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            System.out.println("Sayı => " + temp);
            lastNumber = temp % 10; // giren sayının son basamağını elde ettiğimiz işlem
            System.out.println("Son basamak => " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber; // sürekli sağa kaydırma, sola kaydırmak isteseydik 10'a bölmeliydik
            System.out.println("Yeni sayı => " + reverseNumber);
            temp /= 10;
            System.out.println("=============");
        }
        if (reverseNumber == number) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(131));


    }
