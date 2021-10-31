package urijudge;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("####0.000");
		Double a = sc.nextDouble();
		Double b = sc.nextDouble();
		Double c = sc.nextDouble();
		
		Double pi = 3.14159;
		Double triangulo = (a *c)/2;
		Double circulo = Math.pow(c, 2)*pi;
		Double trapezio = ((a+b)*c)/2;
		Double quadrado = b*b;
		Double retangulo = a*b;
		
		System.out.println("TRIANGULO: " + df.format(triangulo));
		System.out.println("CIRCULO: " + df.format(circulo));
		System.out.println("TRAPEZIO: " + df.format(trapezio));
		System.out.println("QUADRADO: " + df.format(quadrado));
		System.out.println("RETANGULO: " + df.format(retangulo));
		sc.close();
 
	}

}
