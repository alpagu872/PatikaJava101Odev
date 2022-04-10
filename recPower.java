import java.util.Scanner;



public class Main {

    static int recPower(int taban,int us){
        if (us == 0 || taban == 1){
            return 1;
        }
        else {
            return taban*recPower(taban,us-1);
        }
    }


    public static void main(String[] args) {
        System.out.println(recPower(2,7));
        
    }
}
    
