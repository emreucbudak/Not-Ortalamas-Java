package test;
import java.util.Scanner;
public class SinifNotOrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e,f,g;
		Scanner ort = new Scanner(System.in);
		System.out.println("Türkçe Notunu Giriniz = ");
		a = ort.nextInt();
		System.out.println("Matematik Notunu Giriniz = ");
		b = ort.nextInt();
		System.out.println("Fizik Notunu Giriniz = ");
		c = ort.nextInt();
		System.out.println("Kimya Notunu Giriniz = ");
		d = ort.nextInt();
		System.out.println("İngilizce Notunu Giriniz = ");
		e = ort.nextInt();
		f = a*6+b*6+c*4+d*4+e*2;
		g = f/22;
		System.out.println("Ortalamanız = " +g);
		

	}

}
