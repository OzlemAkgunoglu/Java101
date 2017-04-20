import java.lang.Mat;
import java.util.*;

public class seri
{
    public static void main (String[] args) throws java.lang.Exception
    {
      Scanner scanner= new Scanner(System.in);
        double x, toplam=0.0, fakt=1,xpow;
        int i,N,isaret=1;
        System.out.print("x degerini giriniz:");
        x=scanner.nextDouble();
        xpow=x;
        System.out.print("toplam veri sayisini giriniz");
        N = scanner.nextInt();
        for (i=1;i<=N;i++ ) 
        {
            toplam += isaret*xpow/fakt;
            isaret= -isaret;
            xpow=x*x*xpow;
            fakt=fakt*(2*i+1)*(2*i);
        }
        System.out.print("toplam="+toplam+"sin(x)");
        System.out.println(Math.sin(x));
    
        
    }
}
