package bilprima;
import java.util.*;

public class BilPrima {
    static void Method(int n){
        boolean Prima = true;
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if(n%i==0) {
                System.out.println( n +" bukan bilangan prima");
                Prima = false;
                break;
            }
        }
        if(Prima)
            System.out.println( n +" bilangan prima");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Bilangan : ");
        int n = input.nextInt();
        Method(n);
    }
}
