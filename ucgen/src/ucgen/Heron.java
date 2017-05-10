
package ucgen;

import java.util.Scanner;

public class Heron {
private double a,b,c,s,Ualan;
public double alan()
{System.out.println("alan hesabý icin kenar uzunluklarini girin ");
Scanner klavye=new Scanner(System.in);
a=klavye.nextDouble();
b=klavye.nextDouble();
c=klavye.nextDouble();
s=(a+b+c)/2;
Ualan=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("heron formulu ile hesaplanan deger"+Ualan);

return Ualan;}
}
