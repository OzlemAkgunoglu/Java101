import java.util.*;
public class palindrom
{
	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		String yazi, son, duz, son1;
		int i, uzunluk, ayir, uzunlukson;
		System.out.println("Palindromluk kontrolü için metni girin");
		yazi=klavye.nextLine();
		uzunluk=yazi.length();
		if (uzunluk%2==1)
		    {
		    ayir=(uzunluk-1)/2;
		    }
		else
		    {
		       ayir=uzunluk/2;
		    }
	    
	    duz=yazi.substring(0,ayir);
	    son=yazi.substring(uzunluk-ayir,uzunluk);
	    uzunlukson=son.length();
	    son1=son.substring(uzunlukson-1);
	    for (i=uzunlukson-1;i>0 ;i-- )
	    {
	        son1=son1+son.substring(i-1,i);
	    }
	    if(son1.equalsIgnoreCase(duz))
	    {
	        System.out.println("yazi palindromdur");
	    }
	    else
	    {
	        System.out.println("yazi palindrom degildir");
	        System.out.println("yazinin palindrom hali:");
	        for(i=uzunluk-1;i>0;i--)
	        {
	        	yazi=yazi+yazi.substring(i-1,i);
	        }
	        System.out.println(yazi);
	    }
	}
}
