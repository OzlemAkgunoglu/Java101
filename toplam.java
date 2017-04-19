import java.io.*;
import java.util.*;

class toplam
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int i=0,N,toplam=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir tam sayi girin");
        N=scanner.nextInt();
        while(i<=N)
        {toplam=toplam+i;
        i++;
        }
        System.out.println("1 den" + N+"kadar sayilarin toplami"+toplam+"dır");
    }
}
