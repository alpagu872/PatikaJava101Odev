import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        kuvvetlerOdev();
    }

public static void kuvvetlerOdev() {

        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana 
        // yazdıran programı yazıyoruz.
        Scanner girdi = new Scanner(System.in);

        int n = girdi.nextInt();

        for (int i = 1, j = 1; i <= n && j <= n; i *= 4, j *= 5) {
            System.out.println(i + ", " + j);

        }

    }


}
