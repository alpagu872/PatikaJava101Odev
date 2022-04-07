import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        sayilariBuyuktenKucugeSiralama();

    }

public static void sayilariBuyuktenKucugeSiralama() {

        Scanner girdi = new Scanner(System.in);

        int a, b, c;
        a = girdi.nextInt();
        b = girdi.nextInt();
        c = girdi.nextInt();
        if ((a < c) && (a < b)) {
            if (b < c) {
                System.out.println(a + "<" + b + "<" + c);
            } else {
                System.out.println(a + "<" + c + "<" + b);
            }
        } else if ((b < c) && (b < a)) {
            if (a < c) {
                System.out.println(b + "<" + a + "<" + c);
            } else {
                System.out.println(b + "<" + c + "<" + a);
            }
        } else if ((c < a) && (c < b)) {
            if (b < a) {
                System.out.println(c + "<" + b + "<" + a);
            } else {
                System.out.println(c + "<" + a + "<" + b);
            }

        }

    }
}
