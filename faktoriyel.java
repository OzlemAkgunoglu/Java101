import java.io.*;
import java.util.*;

class faktoriyel
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner= new Scanner(System.in);
        int n,fakt=1;
        System.out.println("faktoriyel almak icin n sayisini giriniz");
        n= scanner.nextInt();
        if(n>=0)
        {for(int i=1;i<=n;i++)
            {
                fakt*=i;                
            }
         System.out.println("n sayisinin faktoriyeli "+fakt+" dir");
        }
        else
            System.out.println("lutfen pozitif deger giriniz");
    }
}
