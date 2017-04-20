import java.lang.Math;
import java.util.*;

public class seri
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner=new Scanner(System.in);
        int kackere,zar1,i;
        System.out.println("Kac kere zar atiyoruz?");
        kackere= scanner.nextInt();
        for(i=0;kackere>i;i++){
            zar1 =((int)(Math.random()*6)+1);
            System.out.println(zar1);
        }
        
        
        
        
    }
}
