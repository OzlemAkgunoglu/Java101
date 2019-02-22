/*Bir kitaptaki bölüm sonu problemlerini çözüyorum.Alternatif çzöümler bulursanız paylaşabilirsiniz
Girilen bir cümledeki boşluk sayısını bulan programın kodunu yazınız.
Örnek çıktı  ----   Bosluk sayisini bulmak istediğiniz cumleyi giriniz
					Merhaba Dunya Burasi Github
					Bu cumledeki boşluk sayısı: 3 */
import java.util.*;
public class bosluk
{
	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		int deger, uzunluk, i, sayac=0;
		String cumle, harf;
		System.out.println("Bosluk sayisini bulmak istediğiniz cumleyi giriniz");
		cumle = klavye.nextLine();
		uzunluk=cumle.length();
		i=uzunluk;
		while(i>0)
			{
				harf=cumle.substring(uzunluk-i,uzunluk-i+1);
				deger=harf.indexOf(" ");
				if (deger!=-1) 
				{
					sayac=sayac+1;
				}
				i--;
			}
		System.out.println("Bosluk sayisi="+ sayac);
		
	}
}
