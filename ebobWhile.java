import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ebobWhile();
    }
public static void ebobWhile() {
        Scanner girdi = new Scanner(System.in);
        int n1, n2, k;
        n1 = girdi.nextInt();
        n2 = girdi.nextInt();
        int ebob = 1, ekok=1;

        k = n1;
        while (k > 1) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                ekok = (n1 * n2) / ebob;
                break;
            }
            k--;
        }
        System.out.println("Ebob : " + ebob + "\nEkok : " + ekok);

    }
}
