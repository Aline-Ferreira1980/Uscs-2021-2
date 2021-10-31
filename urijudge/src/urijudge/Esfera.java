package urijudge;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Esfera {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("####0.000");
		
		double raio= sc.nextDouble(), pi=3.14159;
		
		double volume= (4/3.0)*pi* Math.pow(raio,3); 
		
		System.out.println("VOLUME = " + df.format(volume));
		
		sc.close();
	}
}
