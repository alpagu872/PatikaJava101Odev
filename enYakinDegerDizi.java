import java.util.Scanner;

public class DizilerOrt {
    public static void main(String[] args) {

        int[] list = {15,12,788,1,-1,-778,2,0};

        Scanner girdi = new Scanner(System.in);

        int n = girdi.nextInt();

        enYakinDeger(list, n);


    }
static void enYakinDeger(int[] arr, int value) {

        Arrays.sort(arr);
        for (int i = 0 ; i <arr.length ; i++){
            if (arr[i]>value){
                System.out.println("En Yakın Büyük: " + arr[i-1]);
                System.out.println("En Yakın Küçük: " + arr[i]);
                break;
            }
        }
        
    }
    
}
