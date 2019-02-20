import java.util.*;
public class terstenyaz{

     public static void main(String []args){
        String yazi;
	int i, uzunluk;
	Scanner klavye= new Scanner(System.in);
	System.out.println("tersten yazicalak yaziyi girin");
	yazi=klavye.nextLine();
	uzunluk=yazi.length();
	uzunluk=(uzunluk-1);
	for (i=uzunluk;i>=0;i--)
	{
	   System.out.print(yazi.charAt(i));
	}
}
}
