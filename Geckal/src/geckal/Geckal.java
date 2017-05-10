package geckal;

public class Geckal {
	public static double orta;
	public static double ortalama(int Not1,int Not2,int Not3)
{  orta=(Not1+Not2+Not3)/3;
	return orta;
}
	public static void mesaj(){
		if (orta>65)
			System.out.println("GECTI");
		else 
			System.out.println("KALDI");
	
}
}
