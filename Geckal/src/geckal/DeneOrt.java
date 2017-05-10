package geckal;

import java.util.Scanner;

public class DeneOrt {
	private static Scanner klavye;

	public static void main(String[] args) {
		int N1,N2,N3;
		System.out.println("ortalama hesabý için notlarý girin");
		klavye = new Scanner(System.in);
		N1= klavye.nextInt();
		N2= klavye.nextInt();
		N3= klavye.nextInt();
		Geckal.ortalama(N1,N2,N3);
		Geckal.mesaj();
	}

}
