
import java.util.Arrays;
import java.util.Scanner;

public class DizilerOrt {

    static boolean isSame(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[list.length];
        int counter = 0;
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < list.length; j++) {
                if ((list[i] == list[j])) {
                    counter++;

                }
            }
            if (!isSame(duplicate, list[i])) {
                duplicate[startIndex++] = list[i];
                System.out.println(list[i] + " Sayısı " + counter + " defa tekrar edildi.");
            }
            counter = 0;
        }
    }}
