package BilPrimaTanpaRekurs;
import java.util.*;

public class Prima {
    public static void main(String[] args)
    {
        int n, x;
        Scanner s = new Scanner(System.in);
        System.out.print("masukan bilangan:");
        n = s.nextInt();
        Prima obj = new Prima();
        x = obj.prime(n, 2);
        if(x == 1)
        {
            System.out.println(n+" bilangan prima");
        }
        else
        {
            System.out.println(n+" is not prime number");
        }
    }
    int prime(int y,int i)
    {
        if(i < y)
        {
            if(y % i != 0)
            {
                return(prime(y, ++i));
            }
            else
            {
                return 0;
            }
        }
        return 1;
    }
}
