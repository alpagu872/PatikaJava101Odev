public class DizilerOrt {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9};
        harmonikOrt(list);


    }

static void harmonikOrt(int[] arr) {
        float total = 0;
        float sonuc;
        for (int i = 0; i < arr.length; i++) {
            total += 1.0 / arr[i];
        }
        sonuc = arr.length / total;
        System.out.println(sonuc);

    }


}
