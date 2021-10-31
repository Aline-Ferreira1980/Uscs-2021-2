package urijudge;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#####0.0000");
		
		Double x1 = sc.nextDouble();
		Double y1 = sc.nextDouble();
		Double x2 = sc.nextDouble();
		Double y2 = sc.nextDouble();
		
		Double distancia = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y2-y1), 2));
		
		System.out.println(df.format(distancia));
		
		
		sc.close();
	}

}
