package urijudge;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("####0.000");

		Integer x = sc.nextInt();
		Double y = sc.nextDouble();
		
		Double consumoMedio = x/y;
		
		System.out.println(df.format(consumoMedio) + " km/l");
		sc.close();
	}

}
