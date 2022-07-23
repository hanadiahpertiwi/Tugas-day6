package Exsponen;
import java.util.*;

public class Exsponen {
    static Integer pow(Integer A, Integer B)
    {
        int Hasil=(int) Math.pow(A, B);
        System.out.println("Hasil Pangkatnya:"+Hasil);
        return Hasil;
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Masukkan Bilangan berpangkat:");

        int A=input.nextInt();

        System.out.print("Masukkan Banyak pangkat:");

        int B=input.nextInt();

        pow(A,B);
    }
}
