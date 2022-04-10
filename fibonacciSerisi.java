import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        fibonacciSerisi();
    }

public static void fibonacciSerisi() {
        Scanner girdi = new Scanner(System.in);
        int length = girdi.nextInt();
        int n1 = 0,n2 = 1, temp;

        for (int i = 0; i < length; i++) {
            temp = n1+n2;
            n1=n2;
            n2=temp;
            System.out.println(temp);
        }
    }
}
