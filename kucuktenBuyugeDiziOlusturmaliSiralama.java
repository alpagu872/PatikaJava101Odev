
import java.util.Arrays;
import java.util.Scanner;

public class DizilerOrt {

    public static void main(String[] args) {
    //Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.


    
        Scanner girdi = new Scanner(System.in);
        System.out.println("Dizinin Boyutu: ");
        int input = girdi.nextInt();

        int[] liste = new int[input];

        for (int i = 0; i < liste.length; i++) {
            System.out.println(i + 1 + ". Sayiyi giriniz: ");
            int sayi = girdi.nextInt();
            liste[i] = sayi;
            System.out.println(i + 1 + ".Sayi: " + liste[i]);
            System.out.println();
        }

//        printList(liste);

        siralama(liste);


    }

    static void printList(int[] arr) { //KULLANILMADI
        System.out.println("Dizi: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void siralama(int[] arr) {
        int temp = 0;
        System.out.println("Sırali Liste: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
            System.out.print(arr[i] + " ");
        }
    }}
